package oop.lesson5_polymorphism;

public class Animal{
    
    public Animal(){
        System.out.println("An Animal has been born");
    }
    
    public void makeNoise(){
        System.out.println("grr grr");
    }
    
    public void eat(String food){
        System.out.println("munch munch, the Animal is eating " + food);
    }
    
}
