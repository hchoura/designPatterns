package com.designPatterns.proxy;
/*
 * the proxy pattern provides a surrogate or placeholder 
 * for another object to control access to it introducing 
 * another level of indirection
 * 
 * access related
 * 3 type:
 * 1) remote : remote resource (in the server)(out your 
 * application) not change the functionality (just access
 * particularity) the same interface
 * 2) virtual : control access to resource expensive resource
 * 3) protection : access management (did you have permission to access to the resource)
 */
public class Main {

  public static void main(String[] args)  {
    String book ="";
    
    BookParser bp = new BookParser(book);
    System.out.println(bp.getNumberOfPages());
    
    System.out.println(bp.getNumberOfPages());

  }

}
