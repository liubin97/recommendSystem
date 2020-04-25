package com.example.recommend.service.impl;

import com.example.recommend.dao.AdminMovieDao;
import com.example.recommend.entity.Movies;
import com.example.recommend.service.AdminMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminMovieServiceimpl implements AdminMovieService {

    @Autowired
    AdminMovieDao adminMovieDao;


    @Override
    public List<Movies> getAllMovieList() {
        return adminMovieDao.getAllMovieList();
    }

    @Transactional
    @Override
    public void insertMovie(Movies movie) {
        adminMovieDao.insertMovie(movie);
    }

    @Transactional
    @Override
    public void deleteMovieByIds(int[] ids) {
        adminMovieDao.deleteMovieByIds(ids);
    }

    @Transactional
    @Override
    public void updateMovies(Movies movie) {
        adminMovieDao.updateMovies(movie);
    }
}
