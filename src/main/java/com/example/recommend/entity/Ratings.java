package com.example.recommend.entity;


public class Ratings {

  private long userId;
  private long movieId;
  private long rating;
  private double timestamp;
  private String introduction;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getRating() {
    return rating;
  }

  public void setRating(long rating) {
    this.rating = rating;
  }


  public double getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(double timestamp) {
    this.timestamp = timestamp;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

}
