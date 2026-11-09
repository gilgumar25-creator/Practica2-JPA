package com.salesianostriana.dam.spring.data.jpa.repositories;

import com.salesianostriana.dam.spring.data.jpa.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {

    public void savePelicula(Pelicula pelicula){

        return listaPeliculas.save(pelicula);
    }

    public void deletePelicula(Pelicula pelicula){

        listaPeliculas.delete(pelicula);

    }

    public void findAll(){


    }

    public void findById(){


    }

    public void count(){



    }

    public void flush(){



    }



}
