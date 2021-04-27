package HackerRankObjectives;

class Exc0 extends Exception{}
class Exc1 extends Exc0{}
public class TipTop {

	
	public static void main(String[] args) {
		
		try {
			throw new Exc1();
		}catch(Exc0 c0) {
			System.out.println("E0 caught");
		}catch(Exception e) {
			System.out.println("e caught");
		}
	}
}