package org.example.rickandmorty.service;

import org.example.rickandmorty.models.PersonajeDTO;
import org.example.rickandmorty.models.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class PersonajeService {
    private RestTemplate restTemplate;

    public PersonajeService(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PersonajeDTO getPersonajeByName(String name) {
        StringBuilder str = new StringBuilder();
        str.append("https://rickandmortyapi.com/api/character/?name=");
        str.append(name);
        try{
            ResponseDTO responseDTO = restTemplate.getForObject(URI.create(str.toString()), ResponseDTO.class);
            if(responseDTO!=null && !responseDTO.results().isEmpty()){
                return responseDTO.results().get(0);
            }
            return null;
        }catch(Exception e){
            return null;
        }



    }
}
