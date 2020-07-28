package com.example.recommend.service.impl;

import com.example.recommend.dao.MoviehomeDao;
import com.example.recommend.entity.Movies;
import com.example.recommend.service.MoviehomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
class MoviehomeServiceImpl implements MoviehomeService {

    @Autowired
    private MoviehomeDao moviehomeDao;

    @Override
    public List<Movies> getAllMovieList() {
        return moviehomeDao.getAllMovieList();
    }

    @Override
    public List<Movies> selectmovie(String Title) {
        return moviehomeDao.selectmovie(Title);
    }


}
