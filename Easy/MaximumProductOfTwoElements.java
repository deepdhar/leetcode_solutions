import java.util.Arrays;

// link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

public class MaximumProductOfTwoElements {
	
	static int maxProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return (nums[n-1]-1) * (nums[n-2]-1);
	}
	
	public static void main(String[] args) {
		int[] nums = {3,4,5,2};
		System.out.println(maxProduct(nums));
	}
	
}
