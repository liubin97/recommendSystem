package com.example.recommend.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class AdminMovieDaoTest {

    @Autowired
    AdminMovieDao adminMovieDao;

    @Test
    void getAllMovieList() {
    }

    @Test
    void insertMovie() {
    }

    @Test
    void deleteMovieByIds() {
        int [] ids = new int[]{2,3};
        adminMovieDao.deleteMovieByIds(ids);
    }

    @Test
    void updateMovies() {
    }
}
