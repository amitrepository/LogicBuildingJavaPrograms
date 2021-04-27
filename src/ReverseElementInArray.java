
public class ReverseElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int length=a.length,i,j,temp;
		
		for( i=0,j=length-1 ;i<j;i++,j--) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		for(int k=0;k<length;k++)
		System.out.print(a[k] +" ");
	}

}
