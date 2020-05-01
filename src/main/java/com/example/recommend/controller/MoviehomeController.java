package com.example.recommend.controller;

import com.example.recommend.entity.Movies;
import com.example.recommend.service.MoviehomeService;
import com.example.recommend.service.LoginService;
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





        @GetMapping("/getmovieList")
        public @ResponseBody Map<String, Object> deleteMovie(){
            Map<String, Object> map = new HashMap<>();
            try{
                List<Movies> movies = moviehomeService.getAllMovieList();
                map.put("movieList",movies);
            }catch (Exception e){
                Object sucess = map.put("sucess", false);
            }
            return map;
        }

    }

