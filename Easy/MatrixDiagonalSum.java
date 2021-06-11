class Solution {
    public int diagonalSum(int[][] mat) {
    	int n = mat.length, res=0;
        for(int i=0; i<n; i++) {
        	res += mat[i][i];
        	if(i!=n-1-i) res += mat[i][n-1-i];
        }
        return res;
    }
}

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6,},{7,8,9}};
		Solution s = new Solution();
		System.out.println(s.diagonalSum(arr));
	}

}
