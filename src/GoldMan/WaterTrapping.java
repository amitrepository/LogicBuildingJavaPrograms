package GoldMan;

public class WaterTrapping {

	public static void main(String[] args) {

		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		int sum = waterTrap(height);
		System.out.println(sum);

	}



	private static int waterTrap(int[] height) {

		int n = height.length;
		int sum = 0;
		int left = 0;
		int right = 0;

		for (int i = 1; i < n - 1; i++) {

			left = height[i];
			for (int j = 0; j < i; j++) {

				left = Math.max(left, height[j]);
			}

			right = height[i];
			for (int j = i + 1; j < n; j++) {

				right = Math.max(right, height[j]);
			}

			sum = sum + (Math.min(left, right) - height[i]);
		}
		return sum;
	}
}
