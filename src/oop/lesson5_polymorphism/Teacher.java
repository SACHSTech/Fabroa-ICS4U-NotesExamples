package oop.lesson5_polymorphism;

import oop.lesson5_polymorphism.*;

public class Teacher extends Person{
    
    //Teacher specific attributes
    private String teacherID;
    private Double salary;
    
    //Constructor
    public Teacher(String fname, String lname, String id, Double sal){
        super(fname, lname);
        salary = sal;
        teacherID = id;
    }
    
    
    //Methods
    
    public String getTeacherID(){
        return teacherID;
    }
    
    public Double getSalary(){
        return salary;
    }
    
    public void setSalary(Double new_salary){
        salary = new_salary;
    }

    public String getNameTag(){
        return "Teacher: " + this.lastName;
    }
}
