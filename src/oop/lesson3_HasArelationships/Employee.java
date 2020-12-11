package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;

public class Employee
{
  String firstName;
  String lastName;
  Address address;

  public Employee(String fName, String lName, Address addr)
  {
    this.firstName = fName;
    this.lastName = lName;
    this.address = addr;
  }

  public String getAddress()
  {
    return this.address.toString();
  }

   public String toString()
  {
    return this.lastName + ", " + this.firstName + "\n" + this.getAddress();
  }

}