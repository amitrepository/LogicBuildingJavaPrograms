package String;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1= new StringBuffer("Amit");
		StringBuffer sb2= new StringBuffer("Amit");
		
		System.out.println(sb1.equals(sb2));  //false
		
		System.out.println(sb1==(sb2)); // false
		
		System.out.println(sb1.toString().compareTo(sb2.toString()));  
		// 0  return 0 when string equal
		
		System.out.println(sb1.toString().equals(sb2.toString())); // true
	}

}
