package practice;

public class CountPalindrome {

	public static void main(String[] args) {
		String s="aba";
		
		int c=palindrome(s);

	}

	private static int palindrome(String s) {
		int count =0;
		if(s==null || s.length()==0) {
			return count;
		}
		
		boolean [][] dp=new boolean [s.length()][s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				dp[i-1][i]=true;
				count ++;
			}
		}
		
		for(int j=2;j<s.length();j++) {
			for(int i=0;i<j;i++) {
				if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j)) {
					dp[i][j]=true;
					count++;
				}
			}
		}
		return count;
	}

}
