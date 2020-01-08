package com.designPatterns.bridge.example;

public class Artist {

  private String bio;
  private String name;

  public String bio() {
    return this.bio;
  }

  public String name() {
    return this.name;
  }

  public Artist(String name, String bio) {
    this.bio = bio;
    this.name = name;
  }

}
