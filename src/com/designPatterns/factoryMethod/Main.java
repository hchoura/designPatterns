package com.designPatterns.factoryMethod;
/*
 * Factory method
 * Abstract factory
 * 
 * factory can abstract the creation of an object
 * encapsulat the creation (instantiation complex , polymorphisme (variety of object(animal random creation )))
 * factory responsible for creating objects(subtype)
 *
 * define an interface (contract) for create object
 *
 * no need for those question: how, why, what param??
 * Combine the creation
 *
 * defer the instantiation to sub classes
 * simple factory create just one concrete creator (without interface)
 */

import java.util.ArrayList;
import java.util.List;

import com.designPatterns.factoryMethod.concreteCreator.BalencedFactory;
import com.designPatterns.factoryMethod.concreteCreator.RandomAnimalFactory;

public class Main {

  public static void main(String[] args) {
    
    List<Animal> animals = new ArrayList<Animal>();
    
    
    Animal a1 = new RandomAnimalFactory(animals).FactoryMethod();
    System.out.println(a1.toString());
    animals.add(a1);
    
    Animal a2 = new RandomAnimalFactory(animals).FactoryMethod();
    System.out.println(a2.toString());
    animals.add(a2);
    
    Animal a3 = new BalencedFactory(animals).FactoryMethod();
    System.out.println(a3.toString());
    animals.add(a3);
  }

}
