# Has-A Relationships: Class Aggregation

When we define classes, we are defining our own data type.  Therefore, we can most certainly define classes with attributes that are objects of another class.

If a class has an object reference for an attribute, it is known as Aggregation. Aggregation represents **HAS-A** relationship.

Consider a situation, `Employee` object contains attributes such as id, name, email etc. It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc. as given below.

#### Address.java
```
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
}
```

#### Employee.java
```
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
}
```

#### EmployeeAddrDemo.java
```
public class EmployeeAddrDemo
{
  public static void main(String[] args)
  {
    Employee jim;
    jim = new Employee("Jim", "Halpert", new Address(1725, "Slough Ave.", "Scranton", "PA", "USA", "18505"));
  }
}
```
