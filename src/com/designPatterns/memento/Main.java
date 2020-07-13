package com.designPatterns.memento;

public class Main {

  public static void main(String[] args) {
    Shape       shape   = new Circle("red");
    DrawHistory history = new DrawHistory(shape);

    System.out.println(shape);
    history.Snapshot();

    shape.setColor("green");
    
    System.out.println(shape);
    history.Snapshot();

    shape.setColor("gray");
    
    System.out.println(shape);
    history.Snapshot();

    // history.remove();
    history.restore(1);

    shape.setColor("bleu");
    
    System.out.println(shape);
    history.Snapshot();

    System.out.println(history); // original content

  }

}
