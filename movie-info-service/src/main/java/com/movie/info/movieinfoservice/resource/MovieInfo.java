package com.movie.info.movieinfoservice.resource;


import com.movie.info.movieinfoservice.movies.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MovieInfo {


    @GetMapping("movies/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){

        return new Movie("1","Transformers");

    }
}
