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


@Controller
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    //listar todas las personas
    @RequestMapping(value = "/persona", method = RequestMethod.GET)
    public String listarPersona(Model model){
        model.addAttribute("titulo", "Personas - ABM");
        model.addAttribute("persona", personaService.findAll());
        return "persona";
    }
    //traigo el dato
    @RequestMapping(value = "/form_persona", method = RequestMethod.GET)
    public String crearPersona(Map<String, Object> model){
        Persona persona = new Persona();
        model.put("titulo", "Carga Persona");
        model.put("persona", persona);
        return "form_persona";
    }
    
    //guardo el dato
    @RequestMapping(value = "/form_persona", method = RequestMethod.POST)
    public String guardaPersona(@Valid Persona persona, BindingResult result, Model model, SessionStatus status){
        
        if(result.hasErrors()){
            model.addAttribute("titulo", "Carga Persona");
            
            return "form_persona";
        }
        personaService.save(persona);
        status.setComplete();
        return "redirect:/persona";
    }
    
    //editar persona
    @RequestMapping(value="/form_persona/{id}")
    public String editaPersona(@PathVariable(value= "id")Long id, Map<String, Object> model){
        Persona persona = null;
        
        if(id > 0){
            persona = personaService.findOne(id);
        }else{
            return "redirect:/persona";
        }
        model.put("titulo", "Editar Persona");
        model.put("persona", persona);    
        return "form_persona";
    }
    
    //eliminar registro
    @RequestMapping(value = "/eliminar_persona/{id}")
    public String elminarPersona(@PathVariable(value = "id") Long id) {
        if (id > 0) {
            personaService.delete(id);
        }
        return "redirect:/persona";
    }
    
}
