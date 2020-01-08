package com.designPatterns.templateMethod.examlpe;

public class Post extends Record {
  String text;
  @Override
  void beforeSave() {
    // TODO Auto-generated method stub

  }

  @Override
  void afterSave() {
    // TODO Auto-generated method stub

  }

  @Override
  void failedSave() {
    // TODO Auto-generated method stub

  }

  @Override
  protected boolean validate() {
    return false;
    
  }

}
