package HackerRankObjectives;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class T4 {

	public static void main(String[] args) {
		Map<Integer,String> cmap=new ConcurrentHashMap<Integer, String>();

		cmap.put(1, "value1");
		cmap.put(1, "value2");
		cmap.put(3, "value3");
		cmap.put(4, "value4");
		
		System.out.println(cmap.size());
		
		
		
		try {
			for(Map.Entry<Integer, String> output1:cmap.entrySet()) {
				cmap.remove(2);
				System.exit(0);
			}
			
		} finally {
			System.out.println("finally");
		}
	}

}
