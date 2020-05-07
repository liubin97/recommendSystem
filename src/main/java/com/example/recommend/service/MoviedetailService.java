package com.example.recommend.service;

import com.example.recommend.entity.Movies;

import java.util.List;

public interface MoviedetailService {
    List<Movies> Getmovie(long movieId);
    List<Movies> getAllMovieList();
}
