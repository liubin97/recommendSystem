package com.example.recommend.dao;

import com.example.recommend.entity.Ratings;

import java.util.List;

public interface RatingsDao {
    List<Ratings> selectRatingByMId(long movieId);


}
