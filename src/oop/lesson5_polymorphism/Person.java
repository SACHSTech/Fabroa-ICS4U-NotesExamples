package oop.lesson5_polymorphism;

import oop.lesson5_polymorphism.*;

public class Person{
    
    private String firstName;
    private String lastName;
    
    public Person(String fname, String lname){
        firstName = fname;
        lastName = lname;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public String getNameTag(){
      return this.lastName + ", " + this.firstName;
    }
}
