package com.salesianostriana.dam.spring.data.jpa;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pelicula {

    @Id @GeneratedValue
    private Long id;

    private String titulo;

    private LocalDate anioEstreno;

    private List<Pelicula> listaPeliculas =  new ArrayList<>();

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Critica> listaCriticas =  new ArrayList<>();


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Genero> listaGeneros = new ArrayList<>();

    //MÉTODOS HELPER DE PELÍCULA

    public void addCritica(Critica critica){

        listaCriticas.add(critica);

    }

    public void removeCritica(Critica critica){

        listaCriticas.remove(critica);


    }


}
