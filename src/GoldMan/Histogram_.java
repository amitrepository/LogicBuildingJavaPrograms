package GoldMan;

import java.util.Stack;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Histogram_ {

	public static void main(String[] args) {

		int[] height = { 2, 1, 5, 6, 2, 3 };
		//int[] height = { 1,1 };
		int area = findMaxArea(height);
		System.out.println(area);

	}

	private static int findMaxArea(int[] arr){
		
		if(arr.length==0)
			return 0;
		if(arr.length==1)
			return arr[0];

		int[] rb = new int[arr.length];
		
		Stack<Integer> st = new Stack<>();
		st.push(arr.length - 1);
		rb[arr.length - 1] = arr.length;
		for (int i = arr.length - 2; i >=0 ; i--) {
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
				st.pop();
			}
			
			if(st.size()==0) {
				rb[i]=arr.length;
			}else {
				rb[i]=st.peek();
			}
			st.push(i);
		}

		int[] lb = new int[arr.length];
		
		st=new Stack<>();
		st.push(0);
		lb[0] = -1;
		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
				st.pop();
			}
			
			if(st.size()==0) {
				lb[i]= -1;
			}else {
				lb[i]=st.peek();
			}
			st.push(i);
		}

		int maxArea = 0;

		for (int i = 0; i < arr.length; i++) {
			int width = rb[i] - lb[i] - 1;
			int area = width * arr[i];

			if (area > maxArea) {
				maxArea = area;
			}
		}

		return maxArea;

	}

}
