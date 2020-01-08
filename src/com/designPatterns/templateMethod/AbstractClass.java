package com.designPatterns.templateMethod;

public abstract class AbstractClass {
  void TemplateMethod() {//a recommendation to be final
    operation1();
    //code
    operation2();
  }
  abstract void operation1();
  abstract void operation2();
}
