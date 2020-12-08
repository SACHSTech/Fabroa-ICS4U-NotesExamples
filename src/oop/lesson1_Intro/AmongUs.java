package oop.lesson1_Intro;

import oop.lesson1_Intro.Player;

public class AmongUs{

  public static void main(String[] args){
    Player player1;
    Player player2;
    Player player3;
    Player player4;

    // Create three crewmates and an imposter
    player1 = new Player("Vanness", "crewmate", "blue", "top hat", "racoon");
    player2 = new Player("Sam", "crewmate", "orange", "leaf", "");
    player3 = new Player("Braeden", "imposter", "purple", "astronaut helmet", "");
    player4 = new Player("Shar", "crewmate", "black", "fedora", "alien");


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
  }
}