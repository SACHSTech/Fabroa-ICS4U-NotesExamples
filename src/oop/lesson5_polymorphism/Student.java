package oop.lesson5_polymorphism;

import oop.lesson5_polymorphism.*;

public class Student extends Person{
    
    //Instance Variables
    private Double gradeAvg;
    
    // Class Variables
    private static int totalStudents = 0;
    
    /**
     * Constructor - creates a new student instance
     * @param fname - the student first name, specified at time of creation
     * @param lname - the student last name, specified at time of creation
     */
     public Student(String fname, String lname){
         super(fname, lname);
         gradeAvg = 0.0;
         
         totalStudents++;  // increase the student count
         
     }
     
     
     /**
      * Getter method for totalStudents
      * @return total number of students created
      */
     public static int getTotalStudents(){
         return totalStudents;
     }
     
     
     /**
      * String representation of a Student
      * @return firstName lastname and grade in a string
      */
      public String toString(){
          return getLastName() + ", " + getFirstName() + ": " + Double.toString(gradeAvg);
      }
      
     
      
      /**
       * Getter method for firstName
       * @return String value of firstName
       */
      public Double getGradeAvg(){
          return gradeAvg;
      }
      
      /**
       * Setter Method for gradeAvg
       *@param newGrade new value for the gradeAvg
       */
      public void setGradeAvg(double newGrade){
          gradeAvg = newGrade;
      }

      public String getNameTag(){
        return "Student: " + this.lastName + ", " + this.firstName;
      }
      
}