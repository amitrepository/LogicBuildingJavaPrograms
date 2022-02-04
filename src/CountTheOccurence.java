import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class CountTheOccurence {

	public static void main(String[] args) {

		String str = "aasse";
//
//
//		String someString = "elephant";
//		long count1 = someString.chars().filter(ch -> ch == 'e').count();
//		System.out.println(count1);

//		HashMap<Character, Integer> hmap = new HashMap<>();
//
//		char ch[] = str.toCharArray();
//
//		for (char c : ch) {
//			if (hmap.containsKey(c)) {
//				hmap.put(c, hmap.get(c) + 1);
//			} else {
//				hmap.put(c, 1);
//			}
//		}
//
//		System.out.println(hmap);

		int count = 0;

		Map<String, String> map = new HashMap<String,String>();
		map= map.entrySet().stream().
				sorted(Map.Entry.comparingByValue()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e1, LinkedHashMap::new));


		String str1 = "ttccccdffgkkkkk";

		for (char c = 'a'; c < 'z'; c++) {
			for (int j = 0; j < str1.length(); j++) {
				if (str1.charAt(j) == c) {
					count++;

				}
			}
			if (count != 0) {
				System.out.println(c + " :" + count);
				count = 0;

			}

		}

	}
}
