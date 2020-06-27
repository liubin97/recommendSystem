package com.example.recommend.dao;


 import  com.example.recommend.entity.Movies;


 import  java.util.List;


public interface MoviehomeDao {

    List<Movies> getAllMovieList();
<<<<<<< HEAD
    Movies selectmovie(String Title);
=======
    List<Movies> selectmovie(long Title);
>>>>>>> Initial commit

}
