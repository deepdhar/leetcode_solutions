package Arrays101;

import java.util.Arrays;

public class SquaresOfSortedArray {
	
	static int[] sortedSquares(int[] nums) {
		
		for(int i=0; i<nums.length; i++)
			nums[i] *= nums[i];
		Arrays.sort(nums);
		return nums;
    }

	public static void main(String[] args) {
		int arr[] = {-4,-1,0,3,10};
		arr = sortedSquares(arr);
		System.out.println(Arrays.toString(arr));
	}

}
