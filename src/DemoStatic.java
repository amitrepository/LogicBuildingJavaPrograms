
public class DemoStatic {

	static int i;
	int j;

	static final int x;
	static {
		x=100;
	}
	
	/*
	 * static member or method belong to class Instead a specific instance this mean
	 * if you make a member static you can access it without object.
	 */
	static void myMethod() {
		System.out.println("static method ");
		System.out.println(i);
	}
	
	void method2(){
		System.out.println(j);
		System.out.println(i);
	}

	static {
		int i;
		String aString;
		System.out.println("inside static block");
	}

	public static void main(String[] args) {

		DemoStatic.myMethod();

		myMethod();

	}

}
