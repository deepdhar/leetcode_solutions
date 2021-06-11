import java.util.Arrays;

public class SortArrayByParity {
	
	static int[] sortArrayByParity(int[] nums) {
		int[] arr = new int[nums.length];
		int c=0;
		for(int i=0; i<nums.length; i++) {
			if((nums[i]&1)!=1) { 
				arr[c] = nums[i];
				c++;
			}
		}
		for(int i=0; i<nums.length; i++) {
			if((nums[i]&1)==1) {
				arr[c] = nums[i];
				c++;
			}
		}
		return arr;
    }

	public static void main(String[] args) {
		int arr[] = {3,1,2,4};
		arr = sortArrayByParity(arr);
		System.out.println(Arrays.toString(arr));
	}

}
