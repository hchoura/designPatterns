package com.designPatterns.bridge.example;

public class Book {

  private String title;
  private String text;

  public Book(String title, String text) {
    this.title = title;
    this.text = text;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
