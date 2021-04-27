
public class PrimeNumber {

	public static void main(String[] args) {
		int num =7, i;
		for( i=2;i<num;i++)
			if(num%i==0)
				break;
		if(num==i)
			System.out.println("number is prime");

	}

}
