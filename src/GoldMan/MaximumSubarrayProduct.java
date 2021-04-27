package GoldMan;

public class MaximumSubarrayProduct {

	public static void main(String[] args) {
		int [] nums= {-2,3,2,4};
		
		int sum=findSum(nums);
		System.out.println(sum);

	}

	private static int findSum(int[] nums) {
		
		  int cprod=nums[0];
	      int oprod=nums[0];
	        for(int i=1;i<nums.length;i++){
	            
	            if(cprod*nums[i]>=nums[i] ){
	                cprod =cprod*nums[i];
	            }else{
	                cprod=nums[i];
	            }
	            
	            if(cprod>=oprod){
	                oprod=cprod;
	            }
	        }
	         
	        
	        return oprod;
	        
	}

}
