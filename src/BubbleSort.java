
public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {10,2000,300,400,50,60,70,80,90,100};
		int len,temp;
		len=a.length;
		
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				    
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");

	}

}
