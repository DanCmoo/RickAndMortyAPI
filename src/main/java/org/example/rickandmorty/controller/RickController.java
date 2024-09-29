package org.example.rickandmorty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class RickController {
    @GetMapping("/form")
    public String mostrarForm(){
        return "form";
    }

    @PostMapping("/consultar")
    public String consultar(){
        return "consulta";
    }

}
