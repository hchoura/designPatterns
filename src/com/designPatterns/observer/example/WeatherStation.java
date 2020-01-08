package com.designPatterns.observer.example;

import java.util.LinkedList;
import java.util.List;

import com.designPatterns.observer.IDependenceObserver;
import com.designPatterns.observer.ISubjectObservable;

public class WeatherStation implements ISubjectObservable {

  private List<IDependenceObserver> observers   = new LinkedList<IDependenceObserver>();
  private int                       Temperature = 0;

  @Override
  public void add(IDependenceObserver observer) {
    this.observers.add(observer);

  }

  @Override
  public void remove(IDependenceObserver observer) {
    this.observers.remove(observer);

  }

  @Override
  public void notifyObserver() {
    for ( IDependenceObserver iDependenceObserver : observers ) {
      iDependenceObserver.update();
    }

  }

  public int getTempereture() {
    return this.Temperature;
  }

  public void setTempereture(int t) {
    this.Temperature = t;
  }
}
