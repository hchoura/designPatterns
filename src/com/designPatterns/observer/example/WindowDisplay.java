package com.designPatterns.observer.example;

import com.designPatterns.observer.IDependenceObserver;
import com.designPatterns.observer.ISubjectObservable;

public class WindowDisplay implements IDependenceObserver {

  private ISubjectObservable station;

  public WindowDisplay(ISubjectObservable observable) {
    this.station = observable;
  }

  @Override
  public void update() {
    int tmp = ( (WeatherStation) station ).getTempereture();
    System.out.println("the tempereture is updated in the window display, it is " + tmp);

  }

}
