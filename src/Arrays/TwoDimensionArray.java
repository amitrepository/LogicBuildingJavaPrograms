package Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int[][] myNumbers = { {1, 5, 3, 4}, {5, 6, 7},{1,3} };

		System.out.println(myNumbers.length);
		
		for(int i=0 ;i<myNumbers.length;++i) {
			for(int j=0;j< myNumbers[i].length;++j) {
				System.out.println(myNumbers[i][j]);
			}
		}

	}

}
