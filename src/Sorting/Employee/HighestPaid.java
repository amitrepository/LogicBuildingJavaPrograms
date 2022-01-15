package Sorting.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaid {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "Amit", 10, 1000));
		emplist.add(new Employee(2, "Sumit", 20, 2000));
		emplist.add(new Employee(3, "Raj", 30, 40000));
		emplist.add(new Employee(4, "Ab", 40, 8000));

		Collections.sort(emplist,
				(p1, p2) -> (p1.getSalary() > p2.getSalary()) ? -1 : (p1.getSalary() < p2.getSalary()) ? +1 : 0);

		for (Employee e : emplist) {
			System.out.println(e);
		}

		Optional<Employee> maxSalaryEmp = 	emplist.stream().collect(Collectors.maxBy(Comparator.comparing(Employee :: getSalary)));

		System.out.println(maxSalaryEmp);
	}

}
