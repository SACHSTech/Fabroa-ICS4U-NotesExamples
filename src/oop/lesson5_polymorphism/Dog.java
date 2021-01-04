package oop.lesson5_polymorphism;

import oop.lesson5_polymorphism.*;

public class Dog extends Animal{
    
    public Dog(){
        System.out.println("An Dog has been born");
    }
    
    
    public void makeNoise(){
        System.out.println("ruff!! ruff!!");
    }

    public void eat(String food){
      System.out.println("nom nom, the Dog is eating " + food);
    }
    
}
