package com.salesianostriana.dam.spring.data.jpa;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Genero {

    @Id @GeneratedValue
    private Long id;

    private String nombre;


    private List<Pelicula> listaPeliculas = new ArrayList<>();

}
