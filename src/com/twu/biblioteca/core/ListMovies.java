package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.repository.MovieRepository;

import java.util.Map;

public class ListMovies {
    private Map<String, Movie> movieMap;
    private MovieRepository movieRepository;

    public ListMovies(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
        this.movieMap = movieRepository.getMovieMap();
    }
    public String getList(){
        String result = "Movies List:\n";
        result += String.format("%-10s%-30s%-15s%-20s%-15s\n","Id","Name","Year","Director","Rate");
        result +="*******************************************************************************\n";
        for (Movie movie : movieMap.values()){
            if(!movie.isChecked()){
            result += String.format("%-10s%-30s%-15s%-20s%-15s\n",
                    movie.getId(),
                    movie.getName(),
                    movie.getYear(),
                    movie.getDirector(),
                    movie.getRating());
            }
        }
        return result;
    }
}
