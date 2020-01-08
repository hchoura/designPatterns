package com.designPatterns.observer;

import com.designPatterns.observer.example.PhoneDisplay;
import com.designPatterns.observer.example.WeatherStation;
import com.designPatterns.observer.example.WindowDisplay;

/*
 * change the state, an other object need to know the change of the state
 * push vs poll
 * when change, it will send an update (to all the dependence:
 *  interest in the changement)
 * 
 * update the subscriber, if there are change.
 * Register the observer, the observable will send an update message.
 * 
 * one to many relationship
 * 
 */
public class Main {

  public static void main(String[] args) {

    WeatherStation station = new WeatherStation();

    PhoneDisplay d1 = new PhoneDisplay(station);
    PhoneDisplay d2 = new PhoneDisplay(station);

    WindowDisplay d3 = new WindowDisplay(station);
    WindowDisplay d4 = new WindowDisplay(station);

    station.add(d1);
    station.add(d2);
    station.add(d3);
    station.add(d4);

    station.notifyObserver();

    // if any modification happen
    station.setTempereture(30);
    station.notifyObserver();

    station.remove(d1);
    station.remove(d2);
    station.remove(d3);

    station.setTempereture(10);
    station.notifyObserver();
  }

}
