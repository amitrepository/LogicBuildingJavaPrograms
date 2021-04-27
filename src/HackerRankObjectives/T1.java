package HackerRankObjectives;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class T1 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		list.add("John");
		list.add("Mac");
		list.add("Kevin");

		Iterator<String> it=list.iterator();
		list.remove("Mac");
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
