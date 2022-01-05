import java.text.SimpleDateFormat;
import java.util.*;

class Test {

//	int test() {
//		try {
//			return 1;
//		}
//		finally {
//			return 2;
//			System.out.println("list.size()");
//		}
//		return 3;
//	}
	public static void main(String args[]) {




		
		List <Integer> list=new ArrayList<Integer>();
		list.add(null);
     	list.add(null);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(3);
		
		//list.stream().forEach(s-> System.out.println(s));

		System.out.println(list.size());
		
		//System.out.println(list.stream().min((i1,i2)-> -i2.compareTo(i1)).get());
		
		//list.stream().sorted((i1,i2)-> i2.compareTo(i1));
		
		Set <Integer> set=new HashSet<Integer>();
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set.size());
		
//		Calendar cal = Calendar.getInstance();
//		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd_hh-mm");
//		String date= sdf.format(cal.getTime());
		

		StringBuffer sb1= new StringBuffer("durga");
		StringBuffer sb2= new StringBuffer("durga");
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
///////////////////////////////////////
		Map<String,String> gfg = new HashMap<String,String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String,String> entry : gfg.entrySet())
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());
	}
		
	}

