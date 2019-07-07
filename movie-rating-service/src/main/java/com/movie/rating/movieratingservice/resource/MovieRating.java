package com.movie.rating.movieratingservice.resource;


import com.movie.rating.movieratingservice.ratings.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MovieRating {

    @GetMapping("ratings/{movieId}")
    public Rating getRating(){

        return new Rating("1",5.5d);
    }
}
