package com.springboot.playa.app.controllers;


import com.springboot.playa.app.models.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Qualifier("personaDaoJPA")
//@SessionAttribute("persona")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    
    @RequestMapping(value = "/persona", method = RequestMethod.GET)
    public String listarPersona(Model model){
        model.addAttribute("titulo", "lista de personas");
        model.addAttribute("persona", personaService.findAll());
        
        return "listarPersona";
    }
}
