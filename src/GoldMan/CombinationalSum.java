package GoldMan;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {

	// traverse the each item
	// add each item into list and reduce the target
	// set the base condition for target to stop iteration or add
	// when target become zero then add into list.

	public static void main(String[] args) {

		int[] candidates = { 2, 3, 6, 7 };

		int target = 7; // [ [2,2,3],[7] ]

		List<List<Integer>> result = combinationalSum(candidates, target);
		System.out.println(result);

	}

	private static List<List<Integer>> combinationalSum(int[] candidates, int target) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();

		Sum(candidates, 0, target, tempList, result);

		return result;

	}

	private static void Sum(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> result) {

		if (target < 0) {
			return;
		}

		if (target == 0) {
			result.add(new ArrayList<>(list));

		}

		for (int i = start; i < candidates.length; i++) {
			list.add(candidates[i]); // 2
			Sum(candidates, i, target - candidates[i], list, result); // 2 ,2 5 ,"" 2 2 2 1 // 2,2,2,2 -1
			list.remove(list.size() - 1);

		}

	}

}
