package practice;

public class SortNumber {
	
	public static void main(String args[]) {
		int arr[]= {3,5,2,1,4};
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];{
						arr[j+1]=temp;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
	}

}
