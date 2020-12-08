package oop.lesson2_Encapsulation;

public class Wall{
  private double dblXpos;
  private double dblHeight;
  private int intHealth;

  /**
  * Constructor
  */
  public Wall(double dblInitXpos, double dblInitHeight){
    this.dblXpos = dblInitXpos;
    this.dblHeight = dblInitHeight;
    this.intHealth = 3;
  }

  /**
  * Getter x position
  * @return x position
  */
  public double getXpos(){
    return this.dblXpos;
  }

  /**
  * Getter method - health
  * @return the health of the wall
  */
  public int getHealth(){
    return this.intHealth;
  }

  /**
  * check if a bird has collided with the wall, if so,decrease health
  * @param birdObj: an instance of a Bird class
  * @return: true  if the bird has collided with the wall
  */
  public boolean collide(Bird birdObj){
    if (birdObj.getYpos() < this.dblHeight && birdObj.getXpos() > this.dblXpos){
      this.intHealth--;
      return true;
    }
    return false; 
  }

  /**
  * check if the wall has been isDestroyed
  * @return true if wall is destroyed
  */
  public boolean isDestroyed(){
    return this.intHealth <= 0;
  }





}

