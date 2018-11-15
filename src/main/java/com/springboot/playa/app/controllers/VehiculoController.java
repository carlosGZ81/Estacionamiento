package com.springboot.playa.app.controllers;

import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

@Controller
@Qualifier("vehiculoDaoJPA")
@SessionAttributes("vehiculo")
public class VehiculoController {

    @Autowired
    private IVehiculoService vehiculoService;

    @RequestMapping(value = {"/listar", "/"}, method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Vehículos Registrados");
        model.addAttribute("vehiculos", vehiculoService.findAll());
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
    public String guardar(@Valid Vehiculo vehiculo, BindingResult result, Model model, SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("titulo", "formulario de Vehiculo");
            return "form";
        }
        vehiculoService.save(vehiculo);
        status.setComplete();
        return "redirect:/listar";
    }

    @RequestMapping(value = "/eliminar/{id}")
    public String elminar(@PathVariable(value = "id") Long id) {
        if (id > 0) {
            vehiculoService.delete(id);
        }
        return "redirect:/listar";
    }
    
    
}
