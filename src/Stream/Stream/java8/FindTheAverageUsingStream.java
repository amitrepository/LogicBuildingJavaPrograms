package Stream.Stream.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheAverageUsingStream {

	public static void main(String[] args) {

		ArrayList<Student> arr = new ArrayList<Student>();
		
		Map m1 = new HashMap();
		m1.put("Maths", 40);
		m1.put("Science", 50);
		
		Map m2 = new HashMap();
		m2.put("Maths", 60);
		m2.put("Science", 20);
		
		arr.add(new Student(m1, "RAJ"));
		arr.add(new Student(m2, "AMIT"));
		
		
		 Map<String, Double> average=  
				 arr.stream().map(s -> s.getSubjectMarks()).flatMap(m -> m.entrySet().stream()).
				 collect(Collectors.groupingBy(Entry::getKey,Collectors.averagingDouble(Entry::getValue)));
		 
		 System.out.println(average);
		 
		 Map<String, Double> average1=  
				 arr.stream().map(s -> s.getSubjectMarks()).flatMap(m -> m.entrySet().stream()).
				 collect(Collectors.groupingBy(Entry::getKey,Collectors.averagingDouble(Entry::getValue)));
		 
		 System.out.println(average1);
		 
		 Map<String, OptionalDouble> avg= calculateAverageMarks(arr);
		 System.out.println(avg);


	}

	private static Map<String, OptionalDouble> calculateAverageMarks(ArrayList<Student> arr) {
		
		Map<String, OptionalDouble> studentAverages = new HashMap<>();
		
				arr.forEach(s->{
			OptionalDouble average=s.getSubjectMarks().values().stream().mapToInt(i->i).average();
			studentAverages.put(s.getName(), average);
			}
		);
				
				arr.forEach(s->{
					OptionalDouble average=s.getSubjectMarks().values().stream().mapToInt(i->i).average();
					System.out.println(average);
				//	studentAverages.put(s.getName(), average);
					});
				
				
		return studentAverages;
		
		
		
		
		
	}

}
