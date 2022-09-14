package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;

public class ClassroomMain
{
    public static void main(String[] args)
  {
      Student douglas = new Student("Douglas", "Lau");
      douglas.setGradeAvg(94);
              
      Teacher fabroa = new Teacher("Eric", "Fabroa", "123abc", 250000.0);
      
      System.out.println(fabroa.getLastName());
      System.out.println(douglas.getFirstName());
      
      Classroom rm119 = new Classroom(119, fabroa);
      rm119.addStudent(douglas);
      
      Student arash = new Student("Arash", "Zelifan");
      arash.setGradeAvg(97);
      rm119.addStudent(arash);

      rm119.printStudentList();
        
      System.out.println(rm119.getSize());
      System.out.println(rm119.getAverage());
    }
}
