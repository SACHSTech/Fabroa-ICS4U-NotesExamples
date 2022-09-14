package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;
import java.util.ArrayList;

public class Classroom {
    
    // attributes
    private int roomNumber;
    private Teacher teacher;
    private ArrayList<Student> students;
    
    public Classroom(int rNum, Teacher cTeacher){
        roomNumber = rNum;
        teacher = cTeacher;
        
        // initialize the student list
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student newStudent){
        students.add(newStudent);
    }
    
    public int getSize(){
        return students.size();
    }

    private Double getGradeTotal(){
      Double total = 0.0;
      for(int i = 0; i < getSize(); i++){
            total = total + students.get(i).getGradeAvg();
        }
      return total;
    }
    
    public Double getAverage(){
       
        Double avg;
        avg = getGradeTotal()/getSize();    
        return avg;     
    }

    public void printStudentList(){
      for(int i = 0; i < getSize(); i++){
        //System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName());
        //System.out.println(students.get(i).toString());
        System.out.println(students.get(i));
      }
    }
}



