package org.example.rickandmorty.service;

import org.example.rickandmorty.persistence.entity.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonajeService {

    private RestTemplate restTemplate;

    public PersonajeService(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Personaje getPersonajeByName(String name) {
        StringBuilder str = new StringBuilder();
        str.append("https://rickandmortyapi.com/api/character/?name=");
        str.append(name);
        return null;

    }
}
