package com.mycompany.cinemaproject.business.concretes;

import com.mycompany.cinemaproject.business.abstracts.MovieService;
import com.mycompany.cinemaproject.core.utilities.results.DataResult;
import com.mycompany.cinemaproject.core.utilities.results.Result;
import com.mycompany.cinemaproject.core.utilities.results.SuccessDataResult;
import com.mycompany.cinemaproject.core.utilities.results.SuccessResult;
import com.mycompany.cinemaproject.dataAccess.abstracts.MovieDao;
import com.mycompany.cinemaproject.entities.concretes.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieManager implements MovieService {

    private MovieDao movieDao;

    @Autowired
    public MovieManager(MovieDao movieDao) {
        super();
        this.movieDao = movieDao;
    }

    @Override
    public DataResult<List<Movie>> getAll() {
        return new SuccessDataResult<List<Movie>>(this.movieDao.findAll(),"Data Listed");

    }


    @Override
    public Result add(Movie movie) {
        this.movieDao.save(movie);
        return new SuccessResult("Movie Added");
    }
}
