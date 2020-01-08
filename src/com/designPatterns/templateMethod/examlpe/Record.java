package com.designPatterns.templateMethod.examlpe;

public abstract class Record {
  public void save() { // template method
    this.validate();
    this.beforeSave();

    boolean query = true; // BD query
    if ( query ) {
      this.afterSave();
    } else {
      this.failedSave();
    }
  }

  protected abstract boolean validate();

  abstract void beforeSave();

  abstract void afterSave();

  abstract void failedSave();
}
