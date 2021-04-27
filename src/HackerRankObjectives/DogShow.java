package HackerRankObjectives;


class Dog{
	public void bark() {
		System.out.println("woof");
	}
}
class hound extends Dog{
	public void sniff() {
		System.out.println("sniff");
	}
	public void bark() {
		System.out.println("howl");
	}
}
public class DogShow {

	public static void main(String[] args) {
		new DogShow().go();
		
	}
	
		
		
		void go()
		{
			new hound().bark();
		  ((Dog)	new hound()).bark();
		
		}
	}


