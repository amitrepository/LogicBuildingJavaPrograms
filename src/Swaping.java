public class Swaping {

	public static void main(String[] args) {
		int i=10,j=20,temp;
		//1
		temp=i;
		i=j;
		j=temp;
		System.out.println("i=" +i +" "+ "j="+j);
		//2 without temp
		i=10;j=20;
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("i=" +i +" "+ "j="+j);
		//3 without temp
		i=10;j=20;
		i=i*j;
		j=i/j;
		i=i/j;
		
		System.out.println("i=" +i +" "+ "j="+j);
		//4 in single line
		i=10;j=20;
		j=i+j-(i=j);
		System.out.println("i=" +i +" "+ "j="+j);
	
		
	}

}
