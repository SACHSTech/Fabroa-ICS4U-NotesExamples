package algorithms;
import java.util.Arrays;

public class SortSelection{

  public static void main (String args[]){
     // create an array of 7 integers
        int[] myArray = {45, 10, 21, 45, 50, 7, 2000};
        System.out.println(Arrays.toString(myArray));
        
        // output the result of a linear search on key 45
        System.out.println(Arrays.toString(selection_sort(myArray)));

  }

  /*
  * Selection sort takes in an array of integers and
  * returns a sorted array of the same integers.
  */
public static int[] selection_sort(int[] intArray)
  {
      int currentMinIndex;
      for (int i = 0; i < intArray.length - 1; i++)  // i represents front of the unsorted list
      {
          System.out.println(Arrays.toString(intArray));

          currentMinIndex = i;  // set current min to front of unsorted list

      //find the index of the min of the unsorted list
          for (int j = i + 1; j < intArray.length; j++)
          {
              if(intArray[j] < intArray[currentMinIndex])
              {
                  currentMinIndex = j;
              }
          }
          
          // swap numbers if needed
          if (i != currentMinIndex)
          {
              int temp = intArray[currentMinIndex];
              intArray[currentMinIndex] = intArray[i];
              intArray[i] = temp;
          }
      }
      
      return intArray;
  }
}