package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortUsingComparable {

	public static void main(String[] args) {

		Student s1 = new Student(10);
		Student s2 = new Student(5);
		Student s3 = new Student(30);
		Student s4 = new Student(20);
		Student s5 = new Student(15);

		List<Student> list = new ArrayList<>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		System.out.println("Before sort:");
		System.out.println(list);

		Collections.sort(list);

		System.out.println("After sort:");
		System.out.println(list);

	}
}
