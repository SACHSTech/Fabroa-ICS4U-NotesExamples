package oop.lesson4_IsArelationships;


/**
* super class
*/
public class Person{
    
    private String firstName;
    private String lastName;
    
    /**
    * constructor
    */
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
}
