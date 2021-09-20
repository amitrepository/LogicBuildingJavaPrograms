package oops.abstraction;

public class ImplementDemoAbstract extends DemoAbstract {

//	ImplementDemoAbstract(Integer i) {
//		super(i);
//	}

	public static void main(String[] args) {
		//Point 1 'DemoAbstract' is abstract; cannot be instantiated  -> DemoAbstract demo = new DemoAbstract();

		DemoAbstract demo = new DemoAbstract() {
			@Override
			public void someMethod() {

			}

			@Override
			public void someMethod2() {

			}
		};
	}

	// below method implemented cause it is extended from DemoAbstract class
	@Override
	public void someMethod() {

	}

	@Override
	public void someMethod2() {

	}
}
