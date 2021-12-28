package ThreadEample;

public class ExampleOfSleepMethod extends Thread {
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(10);
				System.out.println("Thread sleep test ... " + i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		
		ExampleOfSleepMethod t1= new ExampleOfSleepMethod();
		
		ExampleOfSleepMethod t2= new ExampleOfSleepMethod();
		
		t1.start();
		t2.start();


	}

}
