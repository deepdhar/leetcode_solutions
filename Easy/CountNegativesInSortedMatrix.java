
public class CountNegativesInSortedMatrix {
	
	static int countNegatives(int[][] grid) {
		int count=0;
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j]<0) count++;
			}
		}
		return count;
    }
	
	public static void main(String args[]) {
		int arr[][] = {{1,-1},{-1,-1}};
		System.out.println(countNegatives(arr));
	}

}
