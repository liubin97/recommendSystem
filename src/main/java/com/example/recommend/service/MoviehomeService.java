package com.example.recommend.service;

import com.example.recommend.entity.Movies;


import java.util.List;

public interface MoviehomeService {

    List<Movies> getAllMovieList();
<<<<<<< HEAD
    Movies selectmovie(String Title);
=======
    List<Movies> selectmovie(long Title);
>>>>>>> Initial commit


}
