package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		int[] arr = list.stream().mapToInt(i -> i).toArray();
		System.out.println(arr.length);

		ArrayList<String> al = new ArrayList<String>();

		// Populating the ArrayList by custom elements
		al.add("Anshul Aggarwal");
		al.add("Mayank Solanki");
		al.add("Abhishek Kelenia");
		al.add("Vivek Gupta");

		// 1st way
		String k[] = al.toArray(new String[al.size()]);
		System.out.println(k.length);
		// 2nd Way
		String[] strings = al.stream().toArray(String[]::new);
		System.out.println(strings.length);

	}

}
