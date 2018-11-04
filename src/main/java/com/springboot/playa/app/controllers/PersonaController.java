package com.springboot.playa.app.controllers;

import com.springboot.playa.app.models.entity.Persona;
import com.springboot.playa.app.models.service.IPersonaService;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    //listar todas las personas
    @RequestMapping(value = "/persona", method = RequestMethod.GET)
    public String listarPersona(Model model) {
        model.addAttribute("titulo", "Personas - ABM");
        model.addAttribute("persona", personaService.findAll());
        return "persona";
    }

    //traigo el dato
    @RequestMapping(value = "/form_persona", method = RequestMethod.GET)
    public String crearPersona(Map<String, Object> model) {
        Persona persona = new Persona();
        model.put("titulo", "Carga Persona");
        model.put("persona", persona);
        return "form_persona";
    }

    //crea persona
    @RequestMapping(value = "/form_persona", method = RequestMethod.POST)
    public String guardaPersona(@Valid Persona persona, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Carga Persona");
            flash.addFlashAttribute("error", "La información no ha podido ser guardada!");
            return "form_persona";
        }

        String mensajeFlash = (persona.getId() != null) ? "Persona editada con exito" : "Persona Creada con exito";

        personaService.save(persona);
        status.setComplete();
        flash.addFlashAttribute("success", mensajeFlash);
        return "redirect:/persona";
    }

    //editar persona
    @RequestMapping(value = "/form_persona/{id}")
    public String editaPersona(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {
        Persona persona = null;

        if (id > 0) {
            persona = personaService.findOne(id);
            if (persona == null) {
                flash.addFlashAttribute("error", "El Id de la persona NO existe!!");
                return "redirect:/persona";
            }
        } else {
            flash.addFlashAttribute("error", "El Id de la persona no puede ser 0");
            return "redirect:/persona";
        }
        model.put("titulo", "Editar Persona");
        model.put("persona", persona);
        return "form_persona";
    }

    //eliminar persona
    @RequestMapping(value = "/eliminar_persona/{id}")
    public String elminarPersona(@PathVariable(value = "id") Long id, RedirectAttributes flash) {
        if (id > 0) {
            personaService.delete(id);
            flash.addFlashAttribute("success", "Persona Eliminada con Exito!");
        }
        return "redirect:/persona";
    }

}
