package com.designPatterns.templateMethod;

import com.designPatterns.templateMethod.examlpe.Record;
import com.designPatterns.templateMethod.examlpe.User;

/*
 * Template method define the skeleton of template operation
 * Deferring same steps to subclasses 
 * without changing the algorithm structure
 * 
 * abstract operation done in the concrete class.
 * hook ; operation before of after the operation.
 */
public class Main {
  
  public static void main(String[] args) {
    Record r = new User("kevin");
    r.save();
  }

}
