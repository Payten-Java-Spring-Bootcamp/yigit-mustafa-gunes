package com.mycompany.cinemaproject.business.abstracts;

import com.mycompany.cinemaproject.core.utilities.results.DataResult;
import com.mycompany.cinemaproject.core.utilities.results.Result;
import com.mycompany.cinemaproject.core.utilities.results.SuccessResult;
import com.mycompany.cinemaproject.entities.concretes.Movie;

import java.util.List;

public interface MovieService {
   DataResult<List<Movie>> getAll();
   Result add(Movie movie);
}
