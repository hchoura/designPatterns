package com.designPatterns.observer.example;

import com.designPatterns.observer.IDependenceObserver;
import com.designPatterns.observer.ISubjectObservable;

public class PhoneDisplay implements IDependenceObserver {

  private ISubjectObservable station;

  public PhoneDisplay(ISubjectObservable observable) {// or (WeatherStation station)
    this.station = observable;
  }

  @Override
  public void update() {
    int tmp = ((WeatherStation) station).getTempereture();
    System.out.println("the tempereture is updated in the phone display, it is "+ tmp);

  }

}
