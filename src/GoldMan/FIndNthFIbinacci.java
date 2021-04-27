package GoldMan;

public class FIndNthFIbinacci {

	public static void main(String[] args) {
		int n=3;
		int res=findFibonacci(n);
		System.out.println(res);

	}

	private static int findFibonacci(int n) {
		if (n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
			
		}
		else
		return findFibonacci(n-1)+findFibonacci(n-2);
	}

}
