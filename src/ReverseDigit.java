
public class ReverseDigit {

	public static void main(String[] args) {
		int num = 123, rev = 0, temp;

		for (; num != 0; num = num / 10) {
			temp = num % 10;
			rev = rev * 10 + temp;
		}
		System.out.println(rev);

	}

}
