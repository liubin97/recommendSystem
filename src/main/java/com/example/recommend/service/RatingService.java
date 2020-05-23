package com.example.recommend.service;

import com.example.recommend.entity.Ratings;

import java.util.List;

public interface RatingService {

    long ratingAverage(long movieId);
}
