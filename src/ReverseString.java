
public class ReverseString {

	public static void main(String[] args) {
		
		String in="Hello Java Programs I love";
		String output=reverseTheStringWordByWord(in);
		System.out.println(output);

	}

	private static String reverseTheStringWordByWord(String str) {
		String[] temp=str.split(" ");
		String res="";
		//System.out.println(temp.length);
		for(int i=temp.length-1;i>=0;i--) {
			res=res+temp[i] +" ";
		}
		return res;
	}

}
