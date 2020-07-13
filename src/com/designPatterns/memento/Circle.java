package com.designPatterns.memento;

public class Circle implements Shape {

  private String color;

  public Circle(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public MementoCanvasState createMemento() {
    return new MementoCanvasState(this.color);
  }

  @Override
  public void loadMemento(MementoCanvasState state) {
    this.color = (String) state.getState();
  }

  @Override
  public String toString() {
    return "The color of the Circle is " + this.color;
  }

}