package String;

public class ReverseThePrinting {

	public static void main(String[] args) {
		char temp;
		String str="Hello Amit";
		char ch[] =str.toCharArray();
		
		int len=ch.length;
		
		for(int i=len-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
