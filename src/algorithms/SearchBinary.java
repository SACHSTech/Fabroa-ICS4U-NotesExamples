package algorithms;

public class SearchBinary{

  public static void main(String[] args)
    {
        
        // create an array of 7 integers
        int[] intMyArray = {7, 10, 21, 45, 50, 2000};
        
        // output the result of a linear search on key 45
        System.out.println(binarySearch(intMyArray, 21));

    }

  public static int binarySearch(int[] intArray, int intKey)
    {
        int low = 0; 					// set low marker to beginning of the list
        int high = intArray.length - 1;			// set high marker to the end of the list        
        while(low <= high)				// repeat while low and high not crossed
        {
            int mid = (low + high) / 2;		// set the mid location (cut list in half)
            int cur = intArray[mid];			// get the mid value
            
            if(cur == intKey)				// key is the mid element value
            {
                return mid;				// return location of key
            }
            else if(cur < intKey)			// key is in the upper half
            {
                low = mid + 1;			// advance low marker, search upper half
            }
            else
            {
                high = mid - 1;			// advance high marker, search lower half
            }
        }
        
        return -1;					// key not found in list
    }

}