package com.designPatterns.iterator;

public class ConcreteIterable<T> implements Iterable {

  private ConcreteIterable(Iterator<T> iterator) {
    super();
    this.iterator = iterator;
  }

  Iterator<T> iterator;

  @Override
  public Iterator<T> getIterator() {
    // TODO Auto-generated method stub
    return null;
  }

}
