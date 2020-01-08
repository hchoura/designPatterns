package com.designPatterns.templateMethod.examlpe;

public class User extends Record {
  
  String userName;

  @Override
  void beforeSave() {
    System.out.println("before save ...");

  }

  @Override
  void afterSave() {
    System.out.println("after save ...");

  }

  @Override
  void failedSave() {
    System.out.println("fialed to save ...");

  }

  @Override
  protected boolean validate() {
    System.out.println("validation ...");
    return this.userName != null;
    
  }

  public User(String userName) {
    this.userName = userName;
  }

}
