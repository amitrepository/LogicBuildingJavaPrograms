package GoldMan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list= new ArrayList<>();
		//list.add(1,2);
		//System.out.println(list);
		
		Map<String,Integer> m= new HashMap<>();
		m.put("a",1);
		Collections.unmodifiableMap(m);
		m.put("b", 2);
		//m.put("a", 2);
		System.out.println(m);
		
		String A="abc";
		String B= new String(A);
		
		System.out.println(A==B);
		
		
	}

}
