
public class ReverseThePrinting {

	public static void main(String[] args) {
		char temp;
		String str="Hello Amit";
		char ch[] =str.toCharArray();
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			
		}
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	}

}
