package ThreadEample;

public class ThreadJoinsExample extends Thread {

	public void run() {
		for (int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Number : "+i);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		ThreadJoinsExample t1= new ThreadJoinsExample();
		ThreadJoinsExample t2= new ThreadJoinsExample();
		ThreadJoinsExample t3= new ThreadJoinsExample();
		
		t1.start();
		try {
			t1.join();
			System.out.println("-----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		

	}

}
