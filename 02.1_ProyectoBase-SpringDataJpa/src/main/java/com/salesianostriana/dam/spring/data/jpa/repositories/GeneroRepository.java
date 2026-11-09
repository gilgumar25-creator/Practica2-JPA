package com.salesianostriana.dam.spring.data.jpa.repositories;

import com.salesianostriana.dam.spring.data.jpa.Genero;
import com.salesianostriana.dam.spring.data.jpa.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero,Long> {

    public void saveGenero(Genero genero){

        return listaGeneros.save(genero);
    }

    public void deleteGenero(Genero genero){

        return listaGeneros.delete(genero);

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
