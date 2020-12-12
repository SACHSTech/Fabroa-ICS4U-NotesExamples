# Has-A Relationships: Class Aggregation

When we define classes, we are defining our own data type.  Therefore, we can most certainly define classes with attributes that are objects of another class.

If a class has an object reference for an attribute, it is known as Aggregation. Aggregation represents **HAS-A** relationship.

Consider a situation, `Employee` object contains attributes such as id, name, email etc. It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc. as given below.
