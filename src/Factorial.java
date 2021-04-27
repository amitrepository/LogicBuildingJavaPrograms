
public class Factorial {

	public static void main(String[] args) {
		int num = 5, fact = 1;
		// 1
		for (int i = 2; i <= num; i++)
			fact = fact * i;
		System.out.println(fact);

//		fact=1;
//		//2
//		for(;num!=0;num--)
//			fact=fact*num;
//		System.out.println(fact);

	}

}
