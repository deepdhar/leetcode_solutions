
public class NumberOfGoodPairs {
	
	static int numIdenticalPairs(int[] nums) {
		int count=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<=i; j++) {
				if(nums[j]==nums[i] && j<i) 
					count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3};
		System.out.println(numIdenticalPairs(arr));
	}

}
