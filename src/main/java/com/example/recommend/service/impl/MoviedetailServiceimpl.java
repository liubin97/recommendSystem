package com.example.recommend.service.impl;

import com.example.recommend.dao.AdminMovieDao;
import com.example.recommend.dao.MoviedetailDao;
import com.example.recommend.entity.Movies;
import com.example.recommend.service.AdminMovieService;
import com.example.recommend.service.MoviedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MoviedetailServiceimpl implements MoviedetailService {

    @Autowired
    MoviedetailDao moviedetailDao;


    @Override
    public List<Movies> Getmovie(long movieId) {
        return   moviedetailDao.Getmovie(movieId);
    }

    @Override
    public List<Movies> getAllMovieList() {
        return   moviedetailDao.getAllMovieList();
    }

}
