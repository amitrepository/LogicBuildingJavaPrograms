
public class ThreadOddEven {

	public static void main(String[] args) {
		
		PrintOddEven print = new PrintOddEven();
		Thread odd = new Thread(new OddEven(print,1));
		Thread even = new Thread(new OddEven(print,2));
		odd.start();
		even.start();

	}

}

class OddEven implements Runnable {
	int startPoint;
	private PrintOddEven ptr;
	
	OddEven(PrintOddEven ptr,int startPoint) {
		this.ptr=ptr;
		this.startPoint=startPoint;
	}

	public void run() {

		while (startPoint <= 20) {
			if (startPoint % 2 == 0) {
				try {
					ptr.printEven(startPoint);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				try {
					ptr.printOdd(startPoint);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			startPoint=startPoint+2;
		}
	}
}

class PrintOddEven {
	public volatile boolean oddChance = true;

	public synchronized void printOdd(int num) throws InterruptedException {
		if (!oddChance) {
			wait();
		}
		System.out.println("Odd Thread :" + num);
		oddChance = false;
		notifyAll();
	}

	public synchronized void printEven(int num) throws InterruptedException {

		if (oddChance) {
			wait();
		}
		System.out.println("Even Thread: " +num);
		oddChance = true;
		notifyAll();
	}
}
