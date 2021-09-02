package Arrays101;

import java.util.ArrayList;

public class RemovElement {
	
	static ArrayList<Integer> removeElement(int[] nums, int val) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val) {
				arr.add(nums[i]);
			}
		}
		return arr;
	}
	
	public static void main(String args[]) {
		int nums[] = {3,2,2,3};
		int val = 3;
		System.out.println(removeElement(nums, val));
	}

}
