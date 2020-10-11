package com.designPatterns.visitor.example2;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<IElement> items = new ArrayList();

    Book           b0    = new Book(10, "java book");
    Book           b1    = new Book(5, "UML book");

    Fruit          f0    = new Fruit(2, 1, "Banana");
    Fruit          f1    = new Fruit(2, 2, "Apple");

    items.add(b0);
    items.add(b1);
    items.add(f0);
    items.add(f1);

    IVisitor market    = new ShoppingCartVisitorImpl("market");
    int      amount = 0;
    
    for ( IElement e : items ) {
      amount += e.accept(market);
    }
    System.out.println("Please process to pay " + amount);
  }

}
