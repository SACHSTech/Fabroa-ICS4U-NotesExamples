package recursion;

public class Recursion{
  public static void main (String[] args){
    System.out.println(rpow(3,4));
    System.out.println(recurLength("mouse"));
    System.out.println(reverse("hello"));
  }

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





