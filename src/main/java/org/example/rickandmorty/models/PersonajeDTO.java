package org.example.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PersonajeDTO(
        @JsonProperty("id") int id,
        @JsonProperty("name")String nombre,
        @JsonProperty("status")String estado,
        @JsonProperty("species")String especie
) {
}
