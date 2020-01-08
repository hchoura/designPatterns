package com.designPatterns.iterator.example;

public interface InventoryIterator<T> {
  Boolean isDone();
  void next();
  T currentItem();//Item
}
