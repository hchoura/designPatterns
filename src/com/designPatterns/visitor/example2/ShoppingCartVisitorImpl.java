package com.designPatterns.visitor.example2;

public class ShoppingCartVisitorImpl implements IVisitor {

  String name;

  public ShoppingCartVisitorImpl(String name) {
    super();
    this.name = name;
  }

  @Override
  public float visit(Fruit fruit) {
    float cost = fruit.getPriceKg() * fruit.getWeight();
    System.out.println("the fruits cost is " + cost);
    return cost;
  }

  @Override
  public float visit(Book book) {
    float cost = book.getPrice();//TODO add the number of copy
    System.out.println("the book price is " + cost);
    return cost;
  }

}
