package com.designPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class DrawHistory {

  private List<MementoCanvasState> mementoList = new ArrayList<MementoCanvasState>();
  private Shape shape;

  public DrawHistory(Shape shape) {
    super();
    this.shape = shape;
  }

  public void Snapshot() {
    this.add(shape.createMemento());
  }

  public void add(MementoCanvasState state) {
    mementoList.add(state);
  }

  public void remove() {
    mementoList.remove(mementoList.get(mementoList.size() - 1));
  }

  public void restore(int i) {
    for ( int j = mementoList.size() ; j > i ; j-- ) {
      mementoList.remove(mementoList.get(i));
    }
    System.out.println("We will restore the " + i + " snapshot");
  }

  @Override
  public String toString() {
    String s = "CareTaker [mementoList= ";

    for ( MementoCanvasState memento : mementoList ) {
      s += memento.getState().toString() + ", ";
    }
    s += "]";
    return s;
  }
}
