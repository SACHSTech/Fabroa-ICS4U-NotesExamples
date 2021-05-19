package oop.lesson1_Intro;

/**
* Defines a Player in the Among Us video game.
*/
public class Player{

  // instance variables
  Boolean aliveYN;
  String role;
  String color;
  String username;
  String hat;
  String pet;


  /**
  * Creates a Player object.
  * @param newUsername player username.
  * @param newRole the role to assigned to the player.
  * @param the color assigned to the player.
  * @param the hat assigned to the player.
  * @param the pet of the assigned player. 
  */
  public Player(String newUsername, String newRole, String newColor, String newHat, String newPet){
    // initialize the instance variables
    this.aliveYN = true;
    this.username = newUsername;
    this.role = newRole;
    this.color = newColor;
    this.hat = newHat;
    this.pet = newPet;
    
  }


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
  
}