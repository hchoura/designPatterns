package com.designPatterns.bridge.example;

public class BookResource implements Resource {
  Book book;

  public BookResource(Book book) {
    this.book = book;
  }

  @Override
  public String snippet() {
    return this.book.getText();
  }

  @Override
  public String image() {
    return null;

  }

  @Override
  public String title() {
    return this.book.getTitle();
  }

}
