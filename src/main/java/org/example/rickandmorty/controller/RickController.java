package org.example.rickandmorty.controller;

import org.example.rickandmorty.models.PersonajeDTO;
import org.example.rickandmorty.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/api")
public class RickController {

    private final RestTemplate restTemplate;
    private PersonajeService personajeService;

    public RickController(@Autowired PersonajeService personajeService, RestTemplate restTemplate) {
        this.personajeService = personajeService;
        this.restTemplate = restTemplate;
    }
    @GetMapping("/form")
    public String mostrarForm(){
        return "form";
    }

    @GetMapping("/consultar")
    public String consultar(@RequestParam(value = "name")String name, Model model){
        PersonajeDTO personajeDTO = personajeService.getPersonajeByName(name);
        if(personajeDTO != null){
            model.addAttribute("id",personajeDTO.id());
            model.addAttribute("name",personajeDTO.name());
            model.addAttribute("status",personajeDTO.status());
            model.addAttribute("species",personajeDTO.species());
        }else{
            model.addAttribute("id","Not found");
        }

        return "consulta";
    }

}
