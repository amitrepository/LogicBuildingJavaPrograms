package GoldMan;

public class Fibo_Sequence {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(fib(n));

	}
	// 1 1 2 3 
	

	private static int fib(int n) {

		if (n <0)
			return 0;
		if (n == 1)
			return 1;

		int[] store = new int[n];

		store[0] = 1;
		store[1] = 1;

		for (int i = 2; i < n; i++)
			store[i] = store[i - 1] + store[i - 2];

		return store[n - 1];
	}

}
