package com.designPatterns.factoryMethod;

import java.util.List;

public abstract class AbstractAnimalFactory implements AnimalFactory {
  protected List<Animal> animals;

  public AbstractAnimalFactory(List<Animal> animal) {
    this.animals = animal;
  }
}
