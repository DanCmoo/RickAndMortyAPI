package org.example.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResponseDTO(
        @JsonProperty("results") List<PersonajeDTO> results
) {
}
