package com.example.recommend.service;

import com.example.recommend.entity.Movies;


import java.util.List;

public interface MoviehomeService {

    List<Movies> getAllMovieList();
    List<Movies> selectmovie(String Title);


}
