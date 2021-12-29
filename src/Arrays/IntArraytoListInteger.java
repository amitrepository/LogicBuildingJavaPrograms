package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArraytoListInteger {

	public static void main(String[] args) {

		int[] ints = {1,2,3};
		List<Integer> list= Arrays.stream(ints).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		
		//This will create a list of integers:
		List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(lst);
		
		//Convert String array to ArrayList [duplicate]
		String str[] = { "Homer", "Marge", "Bart", "Lisa", "Maggie" };
		List<String> lstt = Arrays.asList(str);
		System.out.println(lstt);
		
		List<String> l1= Arrays.stream(str).collect(Collectors.toList());
		
		System.out.println(l1);

	}

}
