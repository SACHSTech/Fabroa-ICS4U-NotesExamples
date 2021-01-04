package algorithms;

public class SearchLinear{
  public static void main(String[] args)
    {
        
        // create an array of 7 integers
        int[] myArray = {45, 10, 21, 45, 50, 7, 2000};
        
        // output the result of a linear search on key 45
        System.out.println(linearSearch(myArray, 21));

    }
    
     /**
     * This method takes an array called array and a 
     * key to search for, and returns the index of
     * key if it is in the array or -1 if it is not
     * found.
     * @param intArray - array of numbers to search
     * @param intKey - the number to search for
     * @return - the position of the key in array or -1 if not in array
     */
    public static int linearSearch(int[] intArray, int intKey)
    {
      int intElement;

        for(int i = 0; i < intArray.length; i++)	// for each item in the array
        {
            intElement = intArray[i];			// get the element at index	
            if(intElement == intKey)			// is element equal to key
            {
                return i;				// return the index of key
            }
        }
        return -1;					// item not in list
    }


}