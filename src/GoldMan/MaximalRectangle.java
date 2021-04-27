package GoldMan;

import java.util.Stack;

public class MaximalRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 }, };

		int sum = maximumSum(matrix);
		System.out.println(sum);

	}

	private static int maximumSum(int[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}

		int[] height = new int[matrix[0].length];
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// System.out.println(matrix[i][j]);
				if (matrix[i][j] == 0) {
					height[j] = 0;
				} else {
					height[j] += 1;
				}
			}
			max = Math.max(max, findArea(height));
		}
		return max;

	}

	private static int findArea(int[] arr) {
		if (arr.length == 0)
			return 0;
		if (arr.length == 1)
			return arr[0];

		int[] rb = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(arr.length - 1);
		rb[arr.length - 1] = arr.length;
		for (int i = arr.length - 2; i >= 0; i--) {
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
				st.pop();
			}

			if (st.size() == 0) {
				rb[i] = arr.length;
			} else {
				rb[i] = st.peek();
			}
			st.push(i);
		}

		int[] lb = new int[arr.length];
		st = new Stack<>();
		st.push(0);
		lb[0] = -1;
		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
				st.pop();
			}

			if (st.size() == 0) {
				lb[i] = -1;
			} else {
				lb[i] = st.peek();
			}
			st.push(i);
		}

		int maxArea = 0;
		int area=0;

		for (int i = 0; i < arr.length; i++) {
			int width = rb[i] - lb[i] - 1;
			area = width * arr[i];

			if (area > maxArea) {
				maxArea = area;
			}
		}

		return maxArea;

	}

}
