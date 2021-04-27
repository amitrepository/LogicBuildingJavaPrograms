package Stream.Parallel.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	
	public static List<Employee> getEmployee(){
		
		 List<Employee> employees= new ArrayList<>();
		 
		 for(int i =0;i<1000;i++) {
			 employees.add(new Employee(i,"employee"+i,"A",Double.valueOf(new Random().nextInt(1000*100))));
		 }
		return employees;
		
	}
	
	
	public static List<Employee> getEmployee_java8(){
		
		return Stream.of(
				new Employee(101,"john","A",6000),
				new Employee(103,"tom","B",20000),
				new Employee(102,"samt","A",5000),
				new Employee(104,"rock","C",10000),
				new Employee(105,"mug","A",1000)
				).collect(Collectors.toList());
		
	}
}
