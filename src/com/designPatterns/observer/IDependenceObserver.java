package com.designPatterns.observer;

public interface IDependenceObserver {

  void update();
  // we can pass the Observable, this will avoid having to pass it
  // in the constructor.
}
