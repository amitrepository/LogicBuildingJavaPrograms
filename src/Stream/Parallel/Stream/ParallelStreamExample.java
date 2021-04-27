package Stream.Parallel.Stream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start=0;
		long end =0;
		
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out:: println);
//		end = System.currentTimeMillis();
//		System.out.println("plain stream  took time: " +(end-start));
//		
//		System.out.println("---------");
//		
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out:: println);
//		end = System.currentTimeMillis();
//		System.out.println("parallel stream  took time: " +(end-start));
		
		IntStream.range(1, 10).forEach(x-> {
			System.out.println("Normal Stream Thread : " +Thread.currentThread().getName() + ":"+ x);
		});
		
		IntStream.range(1, 10).parallel().forEach(x-> {
			System.out.println("Paralle Stream Thread : " +Thread.currentThread().getName() + ":"+ x);
		});
		
		
		List<Employee> employees = EmployeeDatabase.getEmployee();
		
		//normal stream
		start = System.currentTimeMillis();
		double salaryStream=employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Normal stream  took time: " +(end-start)+ "  Avg Salary :" + salaryStream);
		
		
		start = System.currentTimeMillis();
		double salaryParallelStream	=employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Parallel stream  took time: " +(end-start)+ "  Avg Salary :" + salaryParallelStream );

	}

}
