package com.example.demo.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<>();
        moviesRepository.findAll().forEach(movies::add);
        return movies;
    }

    public Movie getMovieDetails(Long id){
        return moviesRepository.findById(id).orElse(null);
    }

    public void addMovie(Movie movie){
        moviesRepository.save(movie);
    }

    public void updateMovie(Movie movie){
        moviesRepository.save(movie);
    }

    public void deleteMovie(Long id){
        moviesRepository.deleteById(id);
    }

}
