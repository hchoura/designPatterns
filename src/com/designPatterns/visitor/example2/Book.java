package com.designPatterns.visitor.example2;

public class Book implements IElement {
  
  private int price;
  private String isbn;

  public Book(int price, String isbn) {
    super();
    this.price = price;
    this.isbn = isbn;
  }
  
  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public float accept(IVisitor visitor) {
    return visitor.visit(this);

  }

}
