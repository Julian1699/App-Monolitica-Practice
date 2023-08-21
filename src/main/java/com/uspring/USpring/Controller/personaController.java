package com.uspring.USpring.Controller;

import com.uspring.USpring.Entity.Persona;
import com.uspring.USpring.Service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class personaController {
    @Autowired
    private personaService personaService;

    @GetMapping("/")
    public String inicio(Model model){
        List<Persona> personas = personaService.getAllPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Model model,Persona persona){
        model.addAttribute("persona",persona);
        return "agregar";
    }

    @PostMapping("/guardar")
    public String guardar(@Validated Persona persona, Errors errors){
        if(errors.hasErrors()){
            return  "agregar";
        }
        personaService.savePersona(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable (name="id") Long id, Persona persona, Model model){
        persona = personaService.getById(id);
        model.addAttribute("persona", persona);
        return "editar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable (name = "id") Long id){
        personaService.getById(id);
        personaService.deletePersona(id);
        return "redirect:/";
    }


}
