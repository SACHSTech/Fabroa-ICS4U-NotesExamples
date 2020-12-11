package oop.lesson3_HasArelationships;

public class Teacher{
    
    private String firstName;
    private String lastName;
    private String teacherID;
    private Double salary;
    
    //Constructor
    public Teacher(String fname, String lname, String id, Double sal){
        this.firstName = fname;
        this.lastName = lname;
        this.salary = sal;
        this.teacherID = id;
    }
    
    
    //Methods
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public String getTeacherID(){
        return this.teacherID;
    }
    
    public Double getSalary(){
        return this.salary;
    }
    
    public void setSalary(Double new_salary){
        this.salary = new_salary;
    }
      
}
