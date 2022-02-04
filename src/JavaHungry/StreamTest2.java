package JavaHungry;

import java.util.List;
import java.util.*;

public class StreamTest2 {
    public static void main(String[] args) {

        //Given a list of integers, find out all the even numbers exist in the list using Stream functions?

        List<Integer> list= Arrays.asList(10,15,8,49,25,98,98,32,15,10,25);

        list.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?

        System.out.println("--------");

        list.stream().filter(e->e.toString().startsWith("1")).forEach(e-> System.out.println(e));

        //How to find duplicate elements in a given integers list in java using Stream functions?

        Set<Integer> set = new HashSet();

        System.out.println("--------");
        list.stream().filter(e->!set.add(e)).forEach(e-> System.out.println(e));

        // Given the list of integers, find the first element of the list using Stream functions?

        System.out.println("--------");

        list.stream().findFirst().ifPresent(System.out::println);

        //Given a list of integers, find the maximum value element present in it using Stream functions?

        int max = list.stream().max((e1,e2)->e1.compareTo(e2)).get();
        System.out.println("-----");
        System.out.println("max : " + max);

        //Given a list of integers, sort all the values present in it in descending order using Stream functions?
        System.out.println("-----");
        list.stream().sorted(Collections.reverseOrder()).forEach(e-> System.out.println( e));



    }
}
