package com.example.recommend.service.impl;

import com.example.recommend.dao.MoviehomeDao;
import com.example.recommend.entity.Movies;
import com.example.recommend.service.MoviehomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class MoviehomeServiceimpl implements MoviehomeService {
    @Override
    public List<Movies> getAllMovieList() {
        return null;
    }

    @Override
    public List<Movies> selectmovie(long Title) {
        return null;
    }
    @Override
    public Movies selectmovie(String Title) {
        return null;
    }
}
