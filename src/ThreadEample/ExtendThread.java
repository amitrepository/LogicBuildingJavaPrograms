package ThreadEample;

public  class ExtendThread extends Thread {

	public void run() {
		System.out.println("run method : Thread is running ...");
	}
	
	public static void main(String[] args) {
	
		ExtendThread t1= new ExtendThread();
		
		t1.start();
		
	}
}
