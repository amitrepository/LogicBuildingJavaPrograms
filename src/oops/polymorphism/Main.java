package oops.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	

	public static void main(String[] args) {
		 
	


List <Integer> list= new ArrayList<Integer>();

list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);

Predicate<Integer> evenFunc = (a) -> a%2 == 0;
Predicate<Integer> oddFunc = evenFunc.negate();

int evenSum = list.stream().filter(evenFunc).mapToInt((a) -> a).sum();
int oddSum = list.stream().filter(oddFunc).mapToInt((a) -> a).sum();

System.out.println(evenSum);

System.out.println(oddSum);


	}

}
