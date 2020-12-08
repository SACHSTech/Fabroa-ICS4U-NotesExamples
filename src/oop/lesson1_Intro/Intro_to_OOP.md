# Introduction to Object Oriented Programming

## What is OOP?
* Object-Oriented Programming
* Represent complex real-world things, consisting of numerous properties, capable of doing complex actions.
* A way of breaking our requirements into chunks that are more manageable than the whole
  * each chunk is **self-contained** yet potentially **reusable** by other programs, while working together as a whole with other chunks
  * chunks → **objects**
* when we code an object, we do so with a **class**
* class →  a blueprint of an object
* object → an **instance** of a class

![class-object](class-object.png)
> Think of a class as a blueprint –  you can't live in it, but you can build a house (an object) from it.

## Three Core Values of OOP
1. Encapsulation
2. Polymorphism
3. Inheritance


### Reasons for OOP
* self-contained - you can make changes/add features to your code without worrying about how other code interacts with it
* use other code without (i.e Android API) without knowing/caring how it works. i.e JUnit
* you can create different or multiple versions of a class without starting from scratch (extend the functionality of existing code).  i.e Calculator --> Scientific calculator


## Class
* a bunch of code that can contain methods, variables, loops, and all other java syntax
* a class is part of a package - most packages contain multiple java classes
* each new class (usually) is defined in it's own similarly nameed .java file
* once we define a class, we can use it to make as many objects as we want that use the class as their blueprint.

### Class Implementation
Consider the game Among Us. Among other classes, we need one to represent a Player.  Defining a class is a *class implementation*. When we  implement the Player class, we would do so in a file called Player.java

[See Player.java class](Player.java)
```
public class Player{
  // instance variables
  Boolean aliveYN;
  String role;
  String color;
  String username;
  String hat;
  String pet;

  // instance methods
}
```



### Instance variables
* Variables defined within a class are called instance variables because each instance of the class (that is, each object of the class) contains its own copy of these variables. 
* Defines the information we want to keep/maintain about an object, i.e `name`, `health`, etc.
* The data for one object is separate and unique from the data for another. i.e each Player has a different name.
* An instance variable can be declared public or private or default (no modifier) (more on that later)

### Instance methods
* Methods defined within a class that represent what an object can do. i.e `walk()`, `performTask()`, `vote()`

```

  public void performTask(String strTask){
    System.out.println("Performing Task; " + strTask);
  }

  public void walk(){
    System.out.println(this.username + " is walking.");
  }

  public void sabotage(String strSabotage){
    System.out.println(this.username + " sabotaging: " + strSabotage);
  }

  public void speak(String strText){
    System.out.println(this.username + " says: " + strText);
  }

   public void callEmergencyMeeting(){
    System.out.println(this.username + " has called an Emergency Meeting ");
  }

  public void vote(String strVoteName){
    System.out.println(this.username + " voted for " + strVoteName);
  }
  ```

### Constructor Method(s)
* special methods defined in a class, used to initialize the an object
* called when a new object is created
* the same name as the class
* no return value in the method signature
* can be defined with input parameters that are specified when an object is created.

```
 public Player(String newUsername, String newRole, String newColor, String newHat, String newPet){
    this.aliveYN = true;
    this.username = newUsername;
    this.role = newRole;
    this.color = newColor;
    this.hat = newHat;
    this.pet = newPet;
  }
```

## Class Instantiation - Creating Objects
Once again, a class is just a blueprint, not a usable object.  To make an object of the type `Player` from our `Player` class we need to instantiate it.  Objects are typically created within other classes, not within its own class definition.  In our example, we create a `Player` object within the `AmongUs` class.

```
    Player player1;
    Player player2;
    Player player3;
    Player player4;

    // Create three crewmates and an imposter
    player1 = new Player("Vanness", "crewmate", "blue", "top hat", "racoon");
    player2 = new Player("Sam", "crewmate", "orange", "leaf", "");
    player3 = new Player("Braeden", "imposter", "purple", "astronaut helmet", "");
    player4 = new Player("Shar", "crewmate", "black", "fedora", "alien");
```   

In the lines above:
* we declare a variable of the type `Player` called `player1`
* the `new Player(...)` part is a call to the `constructor` method, passing in details of the player at the time of creation (instantiation)
* assignment operator in between means we assign the result of the constructor to our `player1` variable

Once we we create an object, we can begin to make use of it's methods.

```
// have the players do stuff
    player1.walk();
    player2.walk();
    player3.walk();
    player4.walk();

    player1.performTask("electrical wires");
    player4.performTask("oxygen");
    player3.sabotage("oxygen");


    // call an emergency meeting
    player4.callEmergencyMeeting();

    // discuss
    player1.speak("Shar is the imposter!!");
    player2.speak("ya, Shar is sus!");
    player3.speak("shar is c tier imposter");
    player4.speak("?? I was trying to do tasks");

    // vote
    player1.vote("Shar");
    player2.vote("Shar");
    player3.vote("Shar");
    player4.vote("Shar");
```
















