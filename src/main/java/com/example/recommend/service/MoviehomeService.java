package com.example.recommend.service;

import com.example.recommend.entity.Movies;


import java.util.List;

public interface MoviehomeService {

    List<Movies> getAllMovieList();
    void insertMovie(Movies movie);
    void deleteMovieByIds(int[] ids);
    void updateMovies(Movies movie);

}
