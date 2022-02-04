package JavaHungry;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// The employee list contains the employees with age less than 18 as well as greater than 18, I need to filter the employees with age greater than 18.
//         Also for all those employees append the name with suffix ' Major', i.e if the name of the employee is 'Joe' the name should be modified as 'Joe Major'
public class RUNClass {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Joe", 19,300));
        list.add(new Employee("Anthony", 16,400));
        list.add(new Employee("Mike", 20,200));

        List<Employee> list1= list.stream().
                filter(s->s.getAge()>18).map(e->
                {
                    e.setName(e.getName()+" Major");
                    return e;
                }).collect(Collectors.toList());

        System.out.println(list1);

    }
}

//    Given a string, return the first recurring character in it, or null if there is no recurring character.
//        For example, given the string "acbbac", return "b". Given the string "abcdef", return null. "acbacb" return "a".















