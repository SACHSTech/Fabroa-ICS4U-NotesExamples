package oop.lesson4_IsArelationships;

import oop.lesson4_IsArelationships.*;
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
    
    public Double getAverage(){
        Double total = 0.0;
        Double avg;
        
        for(int i = 0; i < getSize(); i++){
            total = total + students.get(i).getGradeAvg();
        }
        
        avg = total/getSize();    
        return avg;     
    }
}



