package org.example.rickandmorty.persistence.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Personaje {
    private int id;
    private String name;
    private String status;
    private String species;

}
