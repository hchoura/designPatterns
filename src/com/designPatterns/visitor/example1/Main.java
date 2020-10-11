package com.designPatterns.visitor.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Elevator e0 = new Elevator(0);
    Elevator e1 = new Elevator(1);
    
    Floor f0 = new Floor(0);
    Floor f1 = new Floor(1);
    Floor f2 = new Floor(2);
    
    List<IElement> visitables = new ArrayList();
    
    
    visitables.add(e0);
    visitables.add(e1);
    visitables.add(f0);
    visitables.add(f1);
    visitables.add(f2);
    
    
    IVisitor emp = new VisitorEmployee("emp name");
    IVisitor guest = new VisitorGuest("guest name");
    
    for ( IElement e : visitables ) {
      e.accept(emp);
      e.accept(guest);
    }
    
  }

}
