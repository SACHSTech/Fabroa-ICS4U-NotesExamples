package oop.lesson5_polymorphism;

import oop.lesson5_polymorphism.*;

public class MainProgram
{
    public static void main(String[] args)
    {
        Dog sparky = new Dog();
        sparky.makeNoise();
        sparky.eat("Steak");
        
        
        Cow betty = new Cow();
        betty.makeNoise();
        
        Fox larry = new Fox();
        larry.makeNoise();
        
    }   
}
