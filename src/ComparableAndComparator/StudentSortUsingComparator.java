package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortUsingComparator {

	public static void main(String[] args) {
		
		 	Student s1 = new Student(10, "Zara");
	        Student s2 = new Student(50, "Jayesh");
	        Student s3 = new Student(20, "Ash");
	        Student s4 = new Student(30, "Kate");
	        
	        List<Student> list = new ArrayList<>();
	        list.add(s1);
	        list.add(s2);
	        list.add(s3);
	        list.add(s4);
	 
	        System.out.println("Before sort:");
	        list.forEach(s -> System.out.print(s.name + " " + s.rollNo + ", "));
	        
	        Collections.sort(list, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					if(o1.rollNo>o2.rollNo) return 1;
					if(o1.rollNo<o2.rollNo) return -1;
					else return 0;
				}
	        	
	        });
	        
	        System.out.println("\n\nAfter sort by name:");
	        list.forEach(s -> System.out.print(s.name + " " + s.rollNo + ", "));

	}

}
