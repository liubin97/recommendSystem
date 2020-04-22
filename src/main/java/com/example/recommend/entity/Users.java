package com.example.recommend.entity;


public class Users {

  private long userId;
  private String gender;
  private long age;
  private long zip;
  private long occupation;
  private String username;
  private String password;
  private String prefer;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public long getZip() {
    return zip;
  }

  public void setZip(long zip) {
    this.zip = zip;
  }


  public long getOccupation() {
    return occupation;
  }

  public void setOccupation(long occupation) {
    this.occupation = occupation;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getPrefer() {
    return prefer;
  }

  public void setPrefer(String prefer) {
    this.prefer = prefer;
  }

}
