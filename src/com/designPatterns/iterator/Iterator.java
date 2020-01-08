package com.designPatterns.iterator;

public interface Iterator<T> {
  Boolean hasNext();
  void next();
  T currentItem();//Item
}
