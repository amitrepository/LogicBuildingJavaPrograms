package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Person.Person.Gender;

public class App {

	public static void main(String[] args) {
		List<Person> listPersons = new ArrayList<>();
		
		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));
// Java Stream filter operation example
		//1  lists only male persons
		
		List<Person> male=listPersons.stream().filter(p->p.getGender().equals(Gender.MALE)).collect(Collectors.toList());
		System.out.println(male);
		
		//only female who are under 25:
		
		System.out.println("----   -----   -----  -----");
		
		listPersons.stream().filter(f->f.getAge()<25).forEach(e-> System.out.println(e));
		
	}

}
