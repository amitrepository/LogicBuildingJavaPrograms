package GoldMan;

public class GCOutput {
	
	static GCOutput gcOutput;
	static int count=0;

	public static void main(String[] args) throws InterruptedException {
		
		GCOutput GCOutput1= new GCOutput();
		GCOutput1=null;
		System.gc();
		Thread.sleep(1000);
		gcOutput=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("Finalized : "+ count);
		
		

	}
	

	@Override
	protected void finalize() 
	{
		count++;
		gcOutput=this;
	}
	

}
