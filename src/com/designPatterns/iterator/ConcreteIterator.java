package com.designPatterns.iterator;

public class ConcreteIterator implements Iterator<Object>{
  
  Iterable iterable;

  private ConcreteIterator(Iterable iterable) {
    super();
    this.iterable = iterable;
  }

  @Override
  public Boolean hasNext() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void next() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Object currentItem() {
    // TODO Auto-generated method stub
    return null;
  }

}
