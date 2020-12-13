package oop.lesson4_IsArelationships;

import oop.lesson4_IsArelationships.*;

public class ClassroomMain
{
    public static void main(String[] args)
  {
      Student ari = new Student("Ari", "Dokmecian");
      ari.setGradeAvg(94);
              
      Teacher fabroa = new Teacher("Eric", "Fabroa", "123abc", 250000.0);
      
      System.out.println(fabroa.getLastName());
      System.out.println(ari.getFirstName());
      
      Classroom rm119 = new Classroom(119, fabroa);
      rm119.addStudent(ari);
      
      Student arash = new Student("Arash", "Zelifan");
      arash.setGradeAvg(97);
      rm119.addStudent(arash);
        
      System.out.println(rm119.getSize());
      System.out.println(rm119.getAverage());
    }
}
