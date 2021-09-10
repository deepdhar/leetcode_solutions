// link: https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

import java.util.Arrays;

public class MaximumProductDifference {
	
	static int maxProductDifference(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return (nums[n-1] * nums[n-2]) - (nums[0] * nums[1]);
	}
	
	public static void main(String[] args) {
		int[] nums = {4,2,5,9,7,4,8};
		System.out.println(maxProductDifference(nums));
	}

}
