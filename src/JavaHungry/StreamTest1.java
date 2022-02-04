package JavaHungry;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest1 {

    final static double INCREMENT_SALARY = 10000;

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Gerhard", 1, 90000));
        list.add(new Employee("Peter", 2, 100000));
        list.add(new Employee("Andriy", 3, 60000));
        list.add(new Employee("Asha", 4, 80000));
        list.add(new Employee("Skye", 4, 70000));

        // 1. demonstrates how to increase each Employee salary by 10000.

        List<Employee> list1 = list.stream().map(e ->
        {
            e.setSalary(e.getSalary() + INCREMENT_SALARY);
            return e;
        }).collect(Collectors.toList());
        System.out.println(list1);  // [Gerhard 1 100000.0, Peter 2 110000.0, Andriy 3 70000.0, Asha 4 90000.0, Asha 4 90000.0]

        // 2. Following example demonstrates how to change each Employee name to upper case using

        List<Employee> list2 = list.stream().map(e->{
            e.setName(e.getName().toUpperCase());
            return e;
        }).collect(Collectors.toList());

        System.out.println(list2);  //[GERHARD 1 100000.0, PETER 2 110000.0, ANDRIY 3 70000.0, ASHA 4 90000.0, ASHA 4 90000.0]

        // 3. Convert list to set using stream and count the frequency

        List<String> names = Arrays.asList(
                "Peter",
                "Martin",
                "John",
                "Peter",
                "Vijay",
                "John",
                "Peter"
        );

        Set<String> unique= names.stream().map(e->{
            return e + " " + Collections.frequency(names,e);
        }).collect(Collectors.toSet());
        System.out.println(unique);   //[Peter 3, Vijay 1, John 2, Martin 1]


        //5. demonstrates how to list out the employees whose salary greater than 80000.

        List<Employee> newEmployees = list.stream()
                .filter(e -> e.getSalary() > 80000)
                .map(e -> e)
                .collect(Collectors.toList());

        System.out.println(newEmployees);  //[GERHARD 1 100000.0, PETER 2 110000.0, ASHA 4 90000.0]
    }



}
