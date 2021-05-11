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
		}else{
			countdown(n-1);	// Recursive Case
			System.out.println(n);
		}
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





