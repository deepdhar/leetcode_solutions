// Lucky Numbers in a Matrix
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
// link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.List;

public class LuckyNumbersInMatrix {
	
	static List<Integer> luckyNumbers (int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		for(int i=0; i<n; i++) {
			int min = matrix[i][0];
			int temp = i;
			
			// finding minimum element
			for(int j=1; j<matrix[i].length; j++) {
				if(matrix[i][j] < matrix[i][j-1]) {
					min = matrix[i][j];
					continue;
				}
				else {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
	}

}
