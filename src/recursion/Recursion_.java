package recursion;

public class Recursion{
  public static void main (String[] args){
    System.out.println(rpow(3,4));
    System.out.println(recurLength("mouse"));
    System.out.println(reverse("hello"));
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



  /** 
  * Compute a power.
  * @param x the base.
  * @param y the exponent.
  * @return x to the power of y.
  */
  public static int rpow(int x, int y){
    //base case
    if (y == 0){
      return 1;
    }else{
      //recursive case
      return x * rpow(x, y-1);
    }
  }

  /**
  * Reproduce the length() function with a recursive version recurLength(). 
  * Where recurLength(String str) returns the length of a string str.
  */
  public static int recurLength (String strWord){
    // base case
    if (strWord.equals("")){
      return 0;
    }else{
      //recursive step
      return 1 + recurLength(strWord.substring(1));
    }
  }

  /**
  * Given a string output the reverse of the string.
  * @param strWord a word.
  * @return strWord in reverse.
  */
  public static String reverse(String strWord){
    // base case
    if (strWord.equals("")){
      return "";
    }else{
      // recursive step
      return reverse(strWord.substring(1)) + strWord.substring(0,1);
    }
  }
}





