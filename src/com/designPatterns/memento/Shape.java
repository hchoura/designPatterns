package com.designPatterns.memento;

public interface Shape {

  // public void Draw();

  // public Shape Erase();

  public MementoCanvasState createMemento();

  public void loadMemento(MementoCanvasState state);

  public String getColor();

  public void setColor(String color);

}
