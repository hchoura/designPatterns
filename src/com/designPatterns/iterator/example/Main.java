package com.designPatterns.iterator.example;

/*
 * 
 */
public class Main {

  public static void main(String[] args) {

    //Inventory inv = new HandHoldInventory<Item>(new Apple(), new Apple());
    Inventory inv = new HandHoldInventory<Item>(new Apple(), new Orange());
    InventoryIterator<?> iter = inv.getIterator();

    while ( iter.isDone() ) {
      Item item = (Item) iter.currentItem();
      // TODO
      System.out.println(item.toString());
      iter.next();
    }
  }

}
