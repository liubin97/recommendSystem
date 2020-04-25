package com.example.recommend.dao;

import com.example.recommend.entity.Movies;

import java.util.List;

public interface AdminMovieDao {
    List<Movies> getAllMovieList();
    void insertMovie(Movies movie);
    void deleteMovieByIds(int[] ids);
    void updateMovies(Movies movie);
}
