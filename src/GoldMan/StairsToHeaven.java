package GoldMan;

public class StairsToHeaven {

	public static void main(String[] args) {
		int n=3;
		
		int res=stairsToHeaven(n);
		System.out.println(res);

	}

	private static int stairsToHeaven(int n) {
		int [] res=new int[n+1];
		res[0]=1;
		res[1]=1;
		
		for(int i=2;i<=n;i++) {
			res[i]=res[i-1]+res[i-2];
			
			System.out.println("i-"+ i + "arr[i]- "+ res[i]);
		}
		return res[n];
	}

}
