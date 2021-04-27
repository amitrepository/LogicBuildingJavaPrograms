package Stream.IntStream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Average2 {

	public static void main(String[] args) {
		int [] arr= new int[] {1,2,3,4,5};
		//System.out.println(arr.length);
		
		int avg=(int) Arrays.stream(arr).average().getAsDouble();
		System.out.println(avg);
		
		System.out.println(Arrays.stream(arr).findAny());
		
		System.out.println(Arrays.stream(arr).max());
		
		System.out.println(Arrays.stream(arr).reduce((x, y)->x+y));
		
		OptionalDouble obj= Arrays.stream(arr).average();
		System.out.println(obj.getAsDouble());

	}

}
