package com.example.recommend.controller;

import com.example.recommend.entity.Movies;
import com.example.recommend.entity.ResponseBean;
import com.example.recommend.service.AdminMovieService;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/adminMovie")
public class AdminMovieController {

    @Autowired
    private AdminMovieService adminMovieService;

    @GetMapping("/selectAllMovies")
    public @ResponseBody
    ResponseBean selectAllMovies(){
        ResponseBean response = new ResponseBean();
        try{
            List<Movies> moviesList = adminMovieService.getAllMovieList();
            response.setSuccess(true);
            response.setData(moviesList);
        }
        catch (Exception e){
            response.setSuccess(false);
            response.setErrMsg(e.getMessage());
        }
        return response;
    }

    @PostMapping("/deleteMovie")
    public @ResponseBody  ResponseBean deleteMovie(@RequestBody  String[] ids){
        ResponseBean response = new ResponseBean();
        try{
            int[] movieids = new int[ids.length];
            for(int i = 0; i<movieids.length;i++){
                movieids[i] = Integer.parseInt(ids[i]);
            }
            adminMovieService.deleteMovieByIds(movieids);
            response.setSuccess(true);
        }
        catch (Exception e){
            response.setSuccess(false);
            response.setErrMsg(e.getMessage());
        }
        return response;
    }

    @PostMapping("/addMovie")
    public void addMovie(@RequestBody String data){
        Movies movie = (Movies) JSONObject.toBean(JSONObject.fromObject(data),Movies.class);
        adminMovieService.insertMovie(movie);
    }

    @PostMapping("/updateMovie")
    public void updateMovie(@RequestBody String data){
        Movies movie = (Movies) JSONObject.toBean(JSONObject.fromObject(data),Movies.class);
        adminMovieService.updateMovies(movie);
    }




}
