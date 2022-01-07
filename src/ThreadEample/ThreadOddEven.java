package ThreadEample;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

public class ThreadOddEven {

	public static void main(String[] args) {

		PrintOddEven ptr= new PrintOddEven();
		Thread odd = new Thread(new OddEven(ptr,1));
		Thread even = new Thread(new OddEven(ptr,2));
		odd.start();
		even.start();

	}
}

class OddEven implements Runnable {
	int num;
	private PrintOddEven ptr;

	public OddEven(PrintOddEven ptr, int num) {
		this.num = num;
		this.ptr = ptr;
	}

	public void run() {
		while(num<=20){
			if(num%2==0){
				try {
					ptr.printEven(num);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				try {
					ptr.printOdd(num);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			num=num+2;
		}

	}
}

class PrintOddEven{

	boolean odd= true;
	public synchronized void printOdd(int i) throws InterruptedException {
		if(!odd){
			wait();
		}
		System.out.println("ODD: "+i);
		odd=false;
		notify();

	}

	public synchronized void printEven(int i) throws InterruptedException {
		if (odd) {
			wait();
		}
		System.out.println("EVEN :" +i);
		odd =true;
		notify();
	}
}


