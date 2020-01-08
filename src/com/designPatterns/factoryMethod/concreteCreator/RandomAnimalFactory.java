package com.designPatterns.factoryMethod.concreteCreator;

import java.util.List;
import java.util.Random;

import com.designPatterns.factoryMethod.AbstractAnimalFactory;
import com.designPatterns.factoryMethod.Animal;
import com.designPatterns.factoryMethod.concreteAnimal.Cat;
import com.designPatterns.factoryMethod.concreteAnimal.Dog;

public class RandomAnimalFactory extends AbstractAnimalFactory {

  // void createAnimal() {
  //
  // }

  public RandomAnimalFactory(List<Animal> animals) {
    super(animals);
  }

  @Override
  public Animal FactoryMethod() {
    Random randomGenerator = new Random();
    int randomInteger = randomGenerator.nextInt(2);

    switch ( randomInteger ) {
      case 0:
        return new Cat();
      case 1:
        return new Dog();
    }
    return null;
  }

}
