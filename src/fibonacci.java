
public class fibonacci {

	public static void main(String[] args) {
	int ele=10,first=0,second=1,third;
	System.out.print(+first +" "+second+" ");
	for(int i=2;i<ele;i++) {
		third=first+second;
		System.out.print(third +" ");
		first=second;
		second=third;
		
	}
	
	String s="Amit";
	if(s.contains("Amit")) {
		System.out.println("Hello");
	}
	

	}

}
