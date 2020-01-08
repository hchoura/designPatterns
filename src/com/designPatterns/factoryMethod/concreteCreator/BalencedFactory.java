package com.designPatterns.factoryMethod.concreteCreator;

import java.util.List;

import com.designPatterns.factoryMethod.AbstractAnimalFactory;
import com.designPatterns.factoryMethod.Animal;
import com.designPatterns.factoryMethod.concreteAnimal.Cat;
import com.designPatterns.factoryMethod.concreteAnimal.Dog;

public class BalencedFactory extends AbstractAnimalFactory {

  public BalencedFactory(List<Animal> animal) {
    super(animal);
    // TODO Auto-generated constructor stub
  }

  void createAnimal() {

  }

  @Override
  public Animal FactoryMethod() {
    // TODO Auto-generated method stub
    // need to know the number of animal per type
    // he will create an object to balance

    int nbrCat = 0, nbrDog = 0;
    for ( Animal animal : animals ) {
      nbrCat += Cat.class.isInstance(animal) ? 1 : 0;
      nbrDog += Dog.class.isInstance(animal) ? 1 : 0;
    }
    
    if ( nbrCat < nbrDog )
      return new Cat();
    return new Dog();// more dogs
  }
}
