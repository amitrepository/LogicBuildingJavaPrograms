package HackerRankObjectives;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Animal> s= new HashSet<Animal>();
		s.add(new Animal());
		s.add(new Animal());
		
		for(Animal a:s) {
			System.out.println(a);
		}
	}

}
