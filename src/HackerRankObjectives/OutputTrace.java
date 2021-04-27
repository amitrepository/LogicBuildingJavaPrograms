package HackerRankObjectives;


interface I1{
	void m1();
	
}
class M1 implements I1{

	@Override
	public void m1() {
		System.out.println("M1");
		
	}
	
}
public class OutputTrace {

	public static void main(String[] args) {
	
		I1 i1=new M1();
		i1.m1();

	}

}
