import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Test {
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
		
	}

}