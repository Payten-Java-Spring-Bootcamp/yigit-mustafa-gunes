package com.mycompany.cinemaproject;

import com.mycompany.cinemaproject.business.abstracts.MovieService;
import com.mycompany.cinemaproject.business.concretes.MovieManager;
import com.mycompany.cinemaproject.dataAccess.abstracts.MovieDao;
import com.mycompany.cinemaproject.entities.concretes.Genres;
import com.mycompany.cinemaproject.entities.concretes.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class MovieTest {

    @Autowired
    private MovieDao repo;

    @Test
    @Transactional
    public void testAddNew(){
        Movie movie = new Movie();
        movie.setMovieId(5);
        movie.setMovieName("Eternals");
        movie.setMovieDirector("Chloé Zhao");
        movie.setGenre(Genres.Science_Fiction);
        movie.setReleaseYear(2021);

        Movie savedMovie = repo.save(movie);
        assertThat(savedMovie).isNotNull();
        assertThat(savedMovie.getMovieId()).isGreaterThan(0);
    }

    @Test
    public void testGet(){
        Integer movieId = 5;
        Optional<Movie> optionalMovie = repo.findById(movieId);
        assertThat(optionalMovie).isPresent();
        System.out.println(optionalMovie.get());
    }

    @Test
    public void testUpdate(){
        Integer movieId=5;
        Optional<Movie> optionalMovie = repo.findById(movieId);
        Movie movie = optionalMovie.get();
        movie.setMovieName("Spiderman: No Way Home");

        Movie updatedMovie = repo.findById(movieId).get();
        assertThat(updatedMovie.getMovieName()).isEqualTo("Spiderman: No Way Home");
    }
}
