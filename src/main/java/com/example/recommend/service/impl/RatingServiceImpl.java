package com.example.recommend.service.impl;

import com.example.recommend.dao.RatingsDao;
import com.example.recommend.entity.Ratings;
import com.example.recommend.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService
{
    @Autowired
    RatingsDao ratingsDao;

    @Override
    public long ratingAverage(long movieId) {
        List<Ratings> ratings= ratingsDao.selectRatingByMId(movieId);
        System.out.println("===============");
        long allratings=0;
        int len =ratings.size();
        for (int i = 0; i < len; i++) {
            System.out.print(ratings.get(i).getRating());
            allratings = allratings+ratings.get(i).getRating();
        }
        return allratings/len;
    }
}
