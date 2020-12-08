package oop.lesson2_Encapsulation;

import java.lang.Math.*;
import java.io.*;


public class AngryBird1{
  public static void main(String[] args) throws IOException{
    
    
    int intWallHealth;
    double dblWallXPos;
    double dblWallHeight;
    double dblTimeInterval;

    double dblThetaDegrees;
    double dblBirdVelocity;
    double dblBirdXpos;
    double dblBirdYpos;

    double dblTheta;
    double dblBirdXvel;
    double dblBirdYvel;
    double dblBirdYvel1;

    boolean boolHitGround;
    boolean boolHitWall;

    intWallHealth = 3;
    dblWallXPos = 20;
    dblWallHeight = 6;
    dblTimeInterval = 0.1;

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    while (intWallHealth > 0){
      //get initial angle and dblBirdVelocity
      System.out.print("Enter the launch angle: ");
      dblThetaDegrees = Double.parseDouble(keyboard.readLine());

      System.out.print("Enter the launch velocity (m/s): ");
      dblBirdVelocity = Double.parseDouble(keyboard.readLine());

      dblBirdXpos = 0; // starting x position of bird
      dblBirdYpos = 3; //starting y position (height) of bird

      dblTheta = Math.toRadians(dblThetaDegrees);
      dblBirdXvel = dblBirdVelocity * Math.cos(dblTheta);
      dblBirdYvel = dblBirdVelocity * Math.sin(dblTheta);

      boolHitGround = false;
      boolHitWall = false;

      while (!(boolHitGround) && !(boolHitWall)){
        //calculate the position and velocity in 0.1 seconds
        dblBirdXpos = dblBirdXpos + dblTimeInterval * dblBirdXvel;
        dblBirdYvel1 = dblBirdYvel - dblTimeInterval * 9.8;
        dblBirdYpos = dblBirdYpos + dblTimeInterval * (dblBirdYvel + dblBirdYvel1)/2.0;
        dblBirdYvel = dblBirdYvel1;

        System.out.println("x pos: " + dblBirdXpos);
        System.out.println("y pos: " + dblBirdYpos);
        System.out.println("");

        //check if bird has hit the ground or hit the wall based on xpos, ypos
        if (dblBirdYpos < 0 && dblBirdXpos < dblWallXPos){
          System.out.println("Hit Ground");
          boolHitGround = true;
        }
        else if(dblBirdYpos < dblWallHeight && dblBirdXpos > dblWallXPos){
          boolHitWall = true;
          intWallHealth--;
          System.out.println("Hit wall");
          System.out.println("Wall health: " + intWallHealth);
        }

        System.out.println("");
      } 

    
    }
    System.out.println("Wall destroyed, attack the pigs!!");
  }
}