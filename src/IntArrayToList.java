import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class IntArrayToList {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 2 };
		// Style 1
		List<Integer> list1= IntStream.of(a).boxed().collect(Collectors.toList());
		// Style 2
		List<Integer> list2= Arrays.stream(a).boxed().collect(Collectors.toList());
		//style 3
		//List<Integer> list3= Arrays.asList(ArrayUtils.toObject(a));
		
		
		//Summing Numbers with Java Stream
		Integer sum= list1.stream().collect(Collectors.summingInt(i-> i));
		System.out.println(sum.intValue());
		
		//Summing Numbers with Java Stream
		Integer sum2=list1.stream().mapToInt(i->i).sum();
		System.out.println(sum2.intValue());
		
//		ArrayList<Integer> array_list = new ArrayList<Integer>();
//
//		try {
//			List<Integer> list = new ArrayList<>();
//
//			list.add(2);
//			list.add(3);
//			list.add(1);
//			list.add(4);
//
//			throw new MyRuntimeException();
//		} catch (Exception e) {
//			System.out.println(e);
//
//		} finally {
//			System.out.println("finally");
//		}

		// Collections.reverse(list);

		// list.stream().forEach(e -> System.out.println(e));

		// Collections.sort(list,());

		// List<Integer> list= Arrays.asList(a);

	}

}
