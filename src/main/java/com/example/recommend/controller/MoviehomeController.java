package com.example.recommend.controller;

import com.example.recommend.entity.Movies;
import com.example.recommend.entity.ResponseBean;
import com.example.recommend.service.MoviehomeService;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/movie")
public class MoviehomeController {



    @Autowired
    private MoviehomeService moviehomeService;


<<<<<<< HEAD
    @GetMapping("/selectmovie")
    public @ResponseBody
    ResponseBean selectmovie(@RequestParam String Title){
=======
    @GetMapping("//selectmovie")
    public @ResponseBody
    ResponseBean selectmovie(@RequestParam long Title){
>>>>>>> Initial commit
        /*JSONObject json = JSONObject.fromObject(Title);
        long Title1 = json.getLong("Title");*/
        ResponseBean response = new ResponseBean();
        try{
<<<<<<< HEAD

            Movies movie= moviehomeService.selectmovie(Title);
            response.setSuccess(true);
            response.setData(movie);
=======
            List<Movies> moviesList = moviehomeService.selectmovie(Title);
            response.setSuccess(true);
            response.setData(moviesList);
>>>>>>> Initial commit
        }
        catch (Exception e){
            response.setSuccess(false);
            response.setErrMsg(e.getMessage());
        }
        return response;
    }
    @GetMapping("/getmovieList")
    public @ResponseBody
    ResponseBean getmovieList(){
        ResponseBean response = new ResponseBean();
        try{
            List<Movies> moviesList = moviehomeService.getAllMovieList();
            response.setSuccess(true);
            response.setData(moviesList);
        }
        catch (Exception e){
            response.setSuccess(false);
            response.setErrMsg(e.getMessage());
        }
        return response;
    }

    }

