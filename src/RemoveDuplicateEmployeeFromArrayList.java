import Sorting.Employee.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateEmployeeFromArrayList {

	public static void main(String[] args) {

		List <Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "A", 10, 1000));
		list.add(new Employee(2, "B", 20, 5000));
		list.add(new Employee(1, "A", 10, 1000));
		list.add(new Employee(3, "C", 30, 4000));
		
		 System.out.println("Sorting.JavaHungry.Employee.JavaHungry.Employee List(Duplicate)");
	       for (Employee employee : list) {
	           System.out.println(employee);
	       }

	    // create has set. Set will contains only unique objects
	       HashSet<Employee> hashSet = new HashSet(list); 
	       
	       System.out.println("Sorting.JavaHungry.Employee.JavaHungry.Employee List: Unique)");
	       for (Employee employee : hashSet) {
	           System.out.println(employee);
	       }
	       
	       
		List<Employee> uniqueEmployee = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Sorting.JavaHungry.Employee.JavaHungry.Employee List-->(Unique)");
		for (Employee employee : uniqueEmployee) {
			System.out.println(employee);
}
	}

}
