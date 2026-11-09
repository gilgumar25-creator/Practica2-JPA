package com.salesianostriana.dam.spring.data.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Critica {

    @Id @GeneratedValue
    private Long id;

    private String autor;

    private String texto;

    private Double puntuacion;

    @ManyToOne
    @JoinColumn(name = "pelicula_id",
            foreignKey = @ForeignKey(name = "PELICULA_ID_FK")
    )
    private Pelicula pelicula;
}
