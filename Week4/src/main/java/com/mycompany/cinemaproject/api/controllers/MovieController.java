package com.mycompany.cinemaproject.api.controllers;

import com.mycompany.cinemaproject.business.abstracts.MovieService;
import com.mycompany.cinemaproject.core.utilities.results.DataResult;
import com.mycompany.cinemaproject.core.utilities.results.Result;
import com.mycompany.cinemaproject.core.utilities.results.SuccessResult;
import com.mycompany.cinemaproject.entities.concretes.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        super();
        this.movieService = movieService;
    }

    //databaseden veri çektiğimiz body
    @GetMapping("/getall")
    public DataResult<List<Movie>> getAll(){
        return this.movieService.getAll();
    }

    //database'e ekle yapmak için kullandığımız body
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(Movie movie){
        return this.movieService.add(movie);
    }

}
