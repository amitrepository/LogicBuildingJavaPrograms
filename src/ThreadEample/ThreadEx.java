package ThreadEample;

public class  ThreadEx extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("A");
			//System.out.println("B");
		}
	}
	
	public static void main(String[] args) {
		ThreadEx t1= new ThreadEx();
		//t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
	}
	
}	

	

