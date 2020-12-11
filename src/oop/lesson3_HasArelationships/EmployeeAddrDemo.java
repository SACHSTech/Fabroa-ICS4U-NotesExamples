package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;

public class EmployeeAddrDemo
{
  public static void main(String[] args)
  {

    Employee jim;
    jim = new Employee("Jim", "Halpert", new Address(1725, "Slough Ave.", "Scranton", "PA", "USA", "18505"));
    System.out.println(jim);
    
  }
}