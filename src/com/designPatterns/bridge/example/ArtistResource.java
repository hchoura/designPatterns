package com.designPatterns.bridge.example;

public class ArtistResource implements Resource {
  Artist artist;

  public ArtistResource(Artist artist) {
    this.artist = artist;
  }

  @Override
  public String snippet() {
    return this.artist.bio();
  }

  @Override
  public String image() {
    return null;

  }

  @Override
  public String title() {
    return this.artist.name();
  }

}
