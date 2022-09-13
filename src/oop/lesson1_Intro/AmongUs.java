package oop.lesson1_Intro;


import oop.lesson1_Intro.Player;

public class AmongUs{

  public static void main(String[] args){
    Player player1;
    Player player2;
    Player player3;
    Player player4;

    // Create three crewmates and an imposter
    player1 = new Player("AndyG", "crewmate", "blue", "top hat", "racoon");
    player2 = new Player("Josh", "crewmate", "orange", "leaf", "");
    player3 = new Player("Alyanna", "imposter", "purple", "astronaut helmet", "");
    player4 = new Player("Lucy", "crewmate", "black", "fedora", "alien");


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
    player1.speak("Lucy is the imposter!!");
    player2.speak("ya, Lucy is sus!");
    player3.speak("Lucy is c tier imposter");
    player4.speak("?? I was trying to do tasks");

    // vote
    player1.vote("Lucy");
    player2.vote("Lucy");
    player3.vote("Lucy");
    player4.vote("Josh");
  }

}