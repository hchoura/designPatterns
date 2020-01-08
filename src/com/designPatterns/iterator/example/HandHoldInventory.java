package com.designPatterns.iterator.example;

public class HandHoldInventory<T> implements Inventory {

  private Item         right;
  private Item         left;
  InventoryIterator<T> iterator;

  public HandHoldInventory(Item right, Item left) {//(InventoryIterator<T> iterator) {
    super();
    //this.iterator = iterator;
    this.right= right;
    this.left= left;
  }

  @Override
  public InventoryIterator getIterator() {
    // TODO Auto-generated method stub
    return new HandHoldIterator(this);
  }

  public Item getRight() {
    return right;
  }

  private void setRight(Item right) {
    this.right = right;
  }

  public Item getLeft() {
    return left;
  }

  private void setLeft(Item left) {
    this.left = left;
  }

}
