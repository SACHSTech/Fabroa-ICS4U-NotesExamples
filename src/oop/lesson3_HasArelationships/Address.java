package oop.lesson3_HasArelationships;


public class Address
{
  int number;
  String streetName;
  String city;
  String province;
  String country;
  String postalCode;

  public Address(int num, String sName, String cty, String prov, String cntry, String pCode)
  {
    this.number = num;
    this.streetName = sName;
    this.city = cty;
    this.province = prov;
    this.postalCode = pCode;
    this.country = cntry;
  }

  public String toString()
  {
    return this.number + " " + this.streetName + ", " + this.city + ", " + this.province + ", " +
     this.postalCode + ", " + this.country;
  }

}