package com.springboot.playa.app.controllers;

import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.springboot.playa.app.models.entity.Vehiculo;
import com.springboot.playa.app.models.service.IVehiculoService;
import com.springboot.playa.app.models.service.UploadFileServiceImpl;
import com.springboot.playa.app.util.paginator.PageRender;
import java.io.IOException;
import java.net.MalformedURLException;
import org.springframework.data.domain.Pageable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("vehiculo")
public class VehiculoController {

    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private IVehiculoService vehiculoService;

    @Autowired
    private UploadFileServiceImpl uploadFileService;

    //VER LAS FOTOS QUE SE SUBEN AL DIRECTORIO
    @GetMapping(value = "/uploads/{filename:.+}")
    public ResponseEntity<Resource> verFoto(@PathVariable String filename) {

        Resource recurso = null;
        try {
            recurso = uploadFileService.load(filename);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + recurso.getFilename() + "\"")
                .body(recurso);
    }

    @GetMapping(value = "/ver/{id}")
    public String ver(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {

        Vehiculo vehiculo = vehiculoService.findOne(id);

        if (vehiculo == null) {
            flash.addFlashAttribute("error", "El vehiculo no existe!");
            return "redirect:/listar";
        }

        model.put("vehiculo", vehiculo);
        model.put("titulo", "Detalle de vehiculo dominio " + vehiculo.getDominio());

        return "ver";
    }

    //listar todos los vehiculos
    @RequestMapping(value = {"/listar", "/"}, method = RequestMethod.GET)
    public String listar(@RequestParam(name = "page", defaultValue = "0") int page, Model model, Authentication authentication) {

        if (authentication != null) {
            logger.info("Hola usuario autenticado, tu username es: ".concat(authentication.getName()));
        }

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null) {
            logger.info("Utilizando forma estática SecurityContextHolder.getContext().getAuthentication(): Usuario autenticado: ".concat(auth.getName()));
        }
        //paginacion
        Pageable pageRequest = PageRequest.of(page, 5);
        Page<Vehiculo> vehiculos = vehiculoService.findAll(pageRequest);
        PageRender<Vehiculo> pageRender = new PageRender<>("/listar", vehiculos);
        //modelo vista
        model.addAttribute("titulo", "Vehículos Registrados");
        model.addAttribute("vehiculos", vehiculos);
        //vista del paginador
        model.addAttribute("page", pageRender);
        return "listar";
    }

    @RequestMapping(value = "/form")
    public String crear(Model model) {
        Vehiculo vehiculo = new Vehiculo();
        model.addAttribute("vehiculo", vehiculo);
        model.addAttribute("titulo", "Registra Vehículo");
        return "form";
    }

    @RequestMapping(value = "/form/{id}")
    public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model) {
        Vehiculo vehiculo = null;

        if (id > 0) {
            vehiculo = vehiculoService.findOne(id);
        } else {
            return "redirect:/listar";
        }
        model.put("vehiculo", vehiculo);
        model.put("titulo", "Editar vehículo");
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(@Valid Vehiculo vehiculo, BindingResult result, @RequestParam("file") MultipartFile foto,
            Model model, RedirectAttributes flash, SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("titulo", "formulario de Vehiculo");
            return "form";
        }
        // para agregar la foto
        if (!foto.isEmpty()) {

            if (vehiculo.getId() != null && vehiculo.getId() > 0 && vehiculo.getFoto() != null
                    && vehiculo.getFoto().length() > 0) {

                uploadFileService.delete(vehiculo.getFoto());
            }

            String uniqueFilename = null;
            try {
                uniqueFilename = uploadFileService.copy(foto);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            flash.addFlashAttribute("info", "Has subido correctamente '" + uniqueFilename + " ' ");

            vehiculo.setFoto(uniqueFilename);
        }
        String mensajeFlash = (vehiculo.getId() != null) ? "Vehiculo editada con exito" : "Vehiculo Creada con exito";

        vehiculoService.save(vehiculo);
        status.setComplete();
        flash.addFlashAttribute("success", mensajeFlash);
        return "redirect:/listar";
    }

    @RequestMapping(value = "/eliminar/{id}")
    public String elminar(@PathVariable(value = "id") Long id, RedirectAttributes flash) {

        if (id > 0) {
            Vehiculo vehiculo = vehiculoService.findOne(id);

            vehiculoService.delete(id);
            flash.addFlashAttribute("success", "Vehiculo Eliminada con Exito!");

            if (uploadFileService.delete(vehiculo.getFoto())) {
                flash.addFlashAttribute("info", "Foto " + vehiculo.getFoto() + " eliminada con éxito!");
            }
        }
        return "redirect:/listar";
    }

}
