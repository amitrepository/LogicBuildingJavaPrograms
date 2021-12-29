package ThreadEample;

public class  ThreadEx extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("A");
			
			//currentThread()
			
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		ThreadEx t1= new ThreadEx();
		ThreadEx t2= new ThreadEx();
		t1.start();
	
		
		t2.start();
	}
	
}	

	

