package com.mycompany.cinemaproject.dataAccess.abstracts;

import com.mycompany.cinemaproject.entities.concretes.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieDao extends JpaRepository<Movie,Integer> {

    public Long countById(Integer id);

}
