
public class AddTheDigit {

	public static void main(String[] args) {
		int num = 123, temp, sum = 0;
		
		for (; num != 0; num = num / 10) {
			temp = num % 10;
			sum = sum + temp;
		}
		
		System.out.println(sum);

	}

}
