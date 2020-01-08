package com.designPatterns.iterator.example;

public class HandHoldIterator<T> implements InventoryIterator<Object> {

  HandHoldInventory<T> inventory; // HandHoldInventory<T>
  int                  index = 0;

  public HandHoldIterator(Inventory iterable) {
    super();
    this.inventory = (HandHoldInventory<T>) iterable;
  }

  @Override
  public Boolean isDone() {
    return this.index < 2;

  }

  @Override
  public void next() {
    this.index += 1;

  }

  @Override
  public Object currentItem() {
    switch ( index ) {
      case 0:
        return this.inventory.getRight();

      case 1:
        return this.inventory.getLeft();

      default:
        return null;
    }
  }

}
