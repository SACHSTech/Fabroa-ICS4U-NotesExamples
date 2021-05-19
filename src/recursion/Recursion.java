package recursion;
import java.io.*;

public class Recursion{
  public static void main (String[] args){
    //countdown(3);
    //System.out.println(factorial(5));
    //System.out.println(iPow(3,3));
    //System.out.println(rPow(3,3));
    System.out.println(recurLength("hello"));

  }

  /***
	 * Recursive function that counts down to 0 then outputs blastoff
	 * @param n
	 */
	public static void countdown(int n)
	{
    if(n == 0){			// Base Case
			System.out.println("Blastoff");
		}
    else{
      System.out.println(n);
			countdown(n-1);	// Recursive Case
		}
  }

  /**
  * Compute the factorial of a number.
  * @param n
  * @return the factorial of n.
  */
  public static int factorial(int n)
  {     
    if(n == 0) // Base case
    {
        return 1;
    }  
    return n * factorial(n - 1);  // Recursive case
  }


/**
  * given base x and exponent y, compute x to the power of y iteratively
  * @param x The base
  * @param y The exponent
  * @return x to the power of y
  */
  public static int iPow(int x, int y){
      
    int result = 1;
    
    for(int i = 0; i < y; i++){
        result = result * x;
    } 
    return result;
    
  }

  public static int rPow(int x, int y){
    // base
    if (y == 0 ){
      return 1;
    }else{
      return x * rPow(x, y-1); //recursive step
    }
  }

  /**
  * Reproduce the length() function with a recursive version recurLength(). 
  * Where recurLength(String str) returns the length of a string str.
  */
  public static int recurLength (String strWord){
    // base case
    System.out.println(strWord);
    if (strWord.equals("")){
      return 0;
    }else{
      //recursive step
      //return 1 + recurLength(strWord.substring(1));
      return 1 + recurLength(strWord.substring(1));
    }
  }



}