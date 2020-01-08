package com.designPatterns.iterator.example;

public interface Inventory {
  InventoryIterator<?> getIterator();
}
