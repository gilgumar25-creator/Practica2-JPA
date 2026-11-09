package com.salesianostriana.dam.spring.data.jpa.repositories;

import com.salesianostriana.dam.spring.data.jpa.Critica;
import com.salesianostriana.dam.spring.data.jpa.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriticaRepository extends JpaRepository<Critica,Long> {

    public void saveCritica(Critica critica){

        return listaCriticas.save(pelicula);
    }

    public void deleteCritica(Critica critica){

        listaCriticas.delete(critica);

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
