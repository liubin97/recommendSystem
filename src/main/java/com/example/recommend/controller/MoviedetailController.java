package com.example.recommend.controller;

import com.example.recommend.dao.MoviedetailDao;
import com.example.recommend.entity.Movies;
import com.example.recommend.entity.ResponseBean;
import com.example.recommend.service.AdminMovieService;
import com.example.recommend.service.MoviedetailService;
import com.example.recommend.service.RatingService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Moviedetail")
public class MoviedetailController {

    @Autowired
    private MoviedetailService moviedetailService;
    @Autowired
    RatingService ratingService;
    @GetMapping("/getMoviedetail")
    public @ResponseBody
    ResponseBean Getmovie(@RequestParam long movieId){
        /*JSONObject json = JSONObject.fromObject(movieId);
        long movieId1 = json.getLong("movieId");*/
        ResponseBean response = new ResponseBean();
        try{
            List<Movies> moviesList = moviedetailService.Getmovie(movieId);

            response.setSuccess(true);
            response.setData(moviesList);
        }
        catch (Exception e){
            response.setSuccess(false);
            response.setErrMsg(e.getMessage());
        }
        return response;
    }

    @GetMapping("/selectAllMovies")
    public @ResponseBody
    ResponseBean selectAllMovies(){
        ResponseBean response = new ResponseBean();
        try{
            List<Movies> moviesList = moviedetailService.getAllMovieList();
            response.setSuccess(true);
            response.setData(moviesList);
        }
        catch (Exception e){
            response.setSuccess(false);
            response.setErrMsg(e.getMessage());
        }
        return response;
    }

    @GetMapping("/getRating")
    public @ResponseBody
    ResponseBean getRating(@RequestParam long movieId){
        ResponseBean response = new ResponseBean();

        try{
            System.out.println("=========");
            long rating= ratingService.ratingAverage(movieId);
            response.setSuccess(true);
            response.setData(rating);
        }
        catch (Exception e){
            response.setSuccess(false);
            response.setErrMsg(e.getMessage());
        }
        return response;
    }

}
