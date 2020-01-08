package com.designPatterns.proxy;

public class BookParser implements IBookParser{

  public BookParser(String book)  {
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public int getNumberOfPages() {
    return 100;
    
  }

}
