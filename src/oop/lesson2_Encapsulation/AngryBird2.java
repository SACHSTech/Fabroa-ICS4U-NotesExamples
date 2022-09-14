package oop.lesson2_Encapsulation;

import oop.lesson2_Encapsulation.*;
import java.io.*;

public class AngryBird2{
  public static void main(String[] args) throws IOException{
    double dblTimeInterval;
    double dblThetaDegrees;
    double dblBirdVelocity;
    boolean boolHitGround;
    boolean boolHitWall;

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    Wall wall;
    Bird bird;

    dblTimeInterval = 0.1;
    wall = new Wall(20,6);

    while (!wall.isDestroyed()){
      //get initial angle and dblBirdVelocity
      System.out.print("Enter the launch angle: ");
      dblThetaDegrees = Double.parseDouble(keyboard.readLine());

      System.out.print("Enter the launch velocity (m/s): ");
      dblBirdVelocity = Double.parseDouble(keyboard.readLine());

      bird = new Bird(dblThetaDegrees, dblBirdVelocity );
      boolHitGround = false;
      boolHitWall = false;

      //System.out.println(bird.dblXpos);
      //bird.setYpos(10.0);
      //bird.printPosition();

      while (!(boolHitGround) && !(boolHitWall)){
        bird.update(dblTimeInterval);
        bird.printPosition();

        //check if bird has hit the ground or hit the wall based on xpos, ypos
        if (bird.getYpos() < 0 && bird.getXpos() < wall.getXpos()){
          System.out.println("Hit Ground");
          boolHitGround = true;
        }
        else if(wall.collide(bird)){
          boolHitWall = true;
          System.out.println("Hit wall");
          System.out.println("Wall health: " + wall.getHealth());
        }
        System.out.println("");
      }
    }
    System.out.println("Wall destroyed, attack the pigs!!");
  }
}