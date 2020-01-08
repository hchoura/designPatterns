package com.designPatterns.bridge;

import com.designPatterns.bridge.example.Artist;
import com.designPatterns.bridge.example.ArtistResource;
import com.designPatterns.bridge.example.Book;
import com.designPatterns.bridge.example.BookResource;
import com.designPatterns.bridge.example.LongForm;
import com.designPatterns.bridge.example.Resource;
import com.designPatterns.bridge.example.ShortForm;

/*
 * the bridge pattern is to the couple and abstraction
 * from its implementation so that the two can vary independently
 */
public class Main {

  public static void main(String[] args) {
    Resource r1 = new  ArtistResource(new Artist("Leonardo da Vinci","Mona Lisa"));
    LongForm lf1 = new LongForm(r1);
    System.out.println(lf1.show());
    
    ShortForm sf1 = new ShortForm(r1);
    System.out.println(sf1.show());
    
    Resource r2 = new  BookResource(new Book("Title","Text book ..."));
    LongForm lf2 = new LongForm(r2);
    System.out.println(lf2.show());
    
    ShortForm sf2 = new ShortForm(r2);
    System.out.println(sf2.show());    

  }

}
