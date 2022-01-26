package Stream.map.reduce;

import java.util.*;

import Stream.Parallel.Stream.EmployeeDatabase;

public class MapReduceExample {

	public static void main(String[] args) {
	
		List<Integer> numbers= Arrays.asList(3,7,8,1,5,9);
		List<String> words= Arrays.asList("corejava","angular","microservices");
		
		int sum=0;
		for(int num:numbers) {
			sum=sum+num;
		}
		//Total sum 33
		System.out.println(sum);
		
		//Total sum 33
		int sum1=numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum1);
		//Total sum 33
		int sum2=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum2);
		//Total sum 33
		Optional<Integer> sum3=numbers.stream().reduce(Integer::sum);
		System.out.println(sum3.get());

		//Max value
		int maxValue=numbers.stream().reduce(0, (a,b)-> a>b ?a:b);
		System.out.println("Max: "+maxValue);
		//Max Value
		int max=numbers.stream().reduce(Integer::max).get();
		System.out.println("Max val: " +max);

		//min
		int min=numbers.stream().reduce(Integer::min).get();
		System.out.println("Min val: " +min);
		//Longest String
		String longestString=words.stream().reduce((w1,w2)->w1.length()>w2.length() ? w1:w2).get();
		System.out.println(longestString);
		
		//get salary of employee
		double avgSal=EmployeeDatabase.getEmployee_java8().stream().filter(e->e.getGrade().equals("A")).map(e->e.getSalary())
		.mapToDouble(i->i).average().getAsDouble();
		
		System.out.println("Avg salary: "  +avgSal);

		LinkedHashMap<Integer,String> l= new LinkedHashMap<>();
		l.put(100,"John");  // Adding Elements
		l.put(105,"Dev");
		l.put(102,"Arya");
		l.put(103,"Zoya");

		//Collections.synchronizedMap(l);
		for(Map.Entry m:l.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		TreeSet<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);

		TreeMap<Integer, Integer> tm = new TreeMap<>();
		tm.put(2, 4);
		tm.put(3, 5);
		tm.put(4, 5);
		tm.put(2, 3);
		System.out.println(set);
		System.out.println(tm);


	}

}
