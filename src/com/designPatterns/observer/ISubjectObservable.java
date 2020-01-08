package com.designPatterns.observer;

public interface ISubjectObservable {
  
  //public static final List<IDependenceObserver> dependency = null;
  
  //we can create an abstract class 
  void add(IDependenceObserver observer);// register()
  void remove(IDependenceObserver observer);
  void notifyObserver ();//broadcast

}
