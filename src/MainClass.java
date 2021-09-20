
class Animal {

	public Animal() {
		System.out.println("great");
	}
}

class Sheep extends Animal{
	
	public Sheep() {
		System.out.println("Animal");
	}

}

public class MainClass{

	public static void main(String[] args) {

		Sheep a = new Sheep();

	}

}
