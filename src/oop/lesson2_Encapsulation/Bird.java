package oop.lesson2_Encapsulation;

import java.lang.Math.*;
import java.io.*;

public class Bird{
  private double dblXpos;
  private double dblYpos;
  private double dblTheta;
  private double dblXvel;
  private double dblYvel;


  /**
  * Constructor
  * @param dblInitTheta - the initial angle in degrees
  * @param dblInitVel - the initial velocity
  */
  public Bird(double dblInitTheta, double dblInitVel){
    this.dblXpos = 0;
    this.dblYpos = 3;

    this.dblTheta = Math.toRadians(dblInitTheta);

    this.dblXvel = dblInitVel * Math.cos(this.dblTheta);
    this.dblYvel = dblInitVel * Math.sin(this.dblTheta);
  }

  /**
  * Getter of x position
  * @return x position of the bird
  */
  public double getXpos(){
    return this.dblXpos;
  }

  /**
  * Getter of y position
  * @return y position of the bird
  */
  public double getYpos(){
    return this.dblYpos;
  }

  /**
  * Update position of bird after time_interval seconds
  * @param time_interval: interval in seconds for computing movement * of bird
  */
  public void update(double dblTimeInterval){
    double dblYvel1;

    this.dblXpos = this.dblXpos + dblTimeInterval * this.dblXvel;
    dblYvel1 = this.dblYvel - dblTimeInterval * 9.8;
    this.dblYpos = this.dblYpos + dblTimeInterval * (this.dblYvel + dblYvel1)/2.0;
    this.dblYvel = dblYvel1;
  }

  /**
  * Set a new vertical position of the bird
  * @param newYpos the new y position in metres.
  */
  public void setYpos(Double newYpos){
    this.dblYpos = newYpos;
  }



  /**
  * Output bird position
  */
  public void printPosition(){
    System.out.println("x pos: " + this.dblXpos);
    System.out.println("y pos: " + this.dblYpos);
  }
}