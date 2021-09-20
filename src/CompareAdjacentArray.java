
public class CompareAdjacentArray {

	public static void main(String[] args) {
		
		 int arr[] = {2,2,2,2,3};
int n = arr.length;
int x = 3;
System.out.println("Element " + x +
      " is present at index "
          + search(arr,n,3));
	}

	static int search(int arr[], int n, int x){
		
	    
        // Traverse the given array starting
        // from leftmost element
        int i = 0;
        while (i < n)
        {
             
            // If x is found at index 
            if (arr[i] == x)
                return i;
     
            // Jump the difference between current
            // array element and x
            i = i + Math.abs(arr[i]-x);
        }
     
        System.out.println ("number is not" +
                                     " present!");
 
        return -1;
	}

}
