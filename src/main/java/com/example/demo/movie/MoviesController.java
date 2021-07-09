package com.example.demo.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    private MoviesService movieService;

    @RequestMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @RequestMapping("/movies/{id}")
    public Movie getMovieDetails(@PathVariable Long id){
        return movieService.getMovieDetails(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/movies/add")
    public void getMovieDetails(@RequestBody Movie movie){
        movieService.addMovie(movie);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/movies/add")
    public void updateMovie(@RequestBody Movie movie){
        movieService.updateMovie(movie);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/movies/{id}")
    public void deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
    }

}
