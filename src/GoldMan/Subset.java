package GoldMan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
	
	
	//Sort The array
	//

	public static void main(String[] args) {
		int []nums = {2,1,3};
		List<List<Integer>> result=subset(nums);
		
		result.stream().forEach(e->System.out.println(e));

	}

	private static List<List<Integer>> subset(int[] nums) {
		
		 List<List<Integer>> results=new ArrayList<>();
		
		if(nums==null || nums.length==0) {
			return results;
		}
		
		List<Integer> subset=new ArrayList<>(); // 1 , 1,2, 123,
		
		toFindAllSubset(nums,results,subset,0);
		
		return results;
	}

	private static void toFindAllSubset(int[] nums, List<List<Integer>> results, List<Integer> subset, int start) {
		
		results.add(new ArrayList<>(subset)); // [], 1 ,12,123, 2 ,23 3 
		
		for(int i =start;i<nums.length;i++) { // 0   // 0 < 3 //
			subset.add(nums[i]); // 1  //2
			toFindAllSubset(nums,results,subset,i+1); 
			subset.remove(subset.size()-1);
		}
		
	}

}
