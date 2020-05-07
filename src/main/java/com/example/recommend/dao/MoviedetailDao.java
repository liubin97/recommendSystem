package com.example.recommend.dao;

import com.example.recommend.entity.Movies;

import java.util.List;

public interface MoviedetailDao {
    List<Movies> Getmovie(long movieId);
    List<Movies> getAllMovieList();
}
