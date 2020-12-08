package oop.lesson1_Intro;

public class Player{
  // instance variables
  Boolean aliveYN;
  String role;
  String color;
  String username;
  String hat;
  String pet;

  public Player(String newUsername, String newRole, String newColor, String newHat, String newPet){
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