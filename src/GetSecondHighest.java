
import java.util.*;
public class GetSecondHighest {

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        print2largest(arr, n);
    }

    private static void print2largest(int[] arr, int arr_size) {

        Arrays.sort(arr);

        System.out.println(arr[arr_size-2]);
        // Start from second last element  // as the largest element is at last
//        for (int i = arr_size - 2; i >= 0; i--)
//        {
//            // If the element is not // equal to largest element
//            if (arr[i] != arr[arr_size - 1])
//            {
//                System.out.printf("The second largest " +
//                        "element is %d\n", arr[i]);
//                return;
//            }
//        }
    }
}
