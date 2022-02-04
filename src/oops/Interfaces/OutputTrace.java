package oops.Interfaces;


interface I1{
	default  void m2(){
		System.out.println("I default");
	}
	void m1();
	
}
class M1 implements I1{

	public void m2() {
		System.out.println("This");
	}

	@Override
	public void m1() {
		System.out.println("M1");
		
	}
	
}
public class OutputTrace {

	public static void main(String[] args) {
	
		I1 i1=new M1();
		i1.m1();
		i1.m2();
		//I1.m1();


	}



}
