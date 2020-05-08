package com.example.recommend.dao;


 import  com.example.recommend.entity.Movies;


 import  java.util.List;


public interface MoviehomeDao {

    List<Movies> getAllMovieList();
    List<Movies> selectmovie(long Title);

}
