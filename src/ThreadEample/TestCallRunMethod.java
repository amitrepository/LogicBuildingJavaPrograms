package ThreadEample;
//
//As we can see in the above program that there is no context-switching 
//because here t1 and t2 will be treated as normal object not thread object.
public class TestCallRunMethod extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestCallRunMethod t1 = new TestCallRunMethod();
		TestCallRunMethod t2 = new TestCallRunMethod();

		t1.run();
		System.out.println("---");
		t2.run();
	}
}
