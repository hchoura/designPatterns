package com.designPatterns.singleton;

/*
 * the singleton pattern ensures a class has 
 * only one instance and provides a global point
 * of access to it 
 * instance one time, global instance
 * problem => change without control
 * single instance.
 *  
 */
public class Main {

  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    if ( s1 == s2 ) System.out.println("the same object");
    else System.out.println("the same object");

  }
}
