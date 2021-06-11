import java.util.Arrays;

public class SearchInRotatedSortedArray {
	
	//SearchInRotatedSortedArrayII
	static boolean search(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length;
	    int mid, lb=0, ub=n-1;
	    while(lb<=ub) {
	        mid = (lb+ub)/2;
	        if(nums[mid]==target) return true;
	        else if(nums[mid]>target) ub = mid-1;
	        else lb = mid+1;
	    }
	    return false;
    }
	
	
	//SearchInRotatedSortedArray
	static int search2(int[] nums, int target) {
        int n = nums.length, loc=-1;
		for(int i=0; i<n; i++)
			if(nums[i]==target) loc = i;
		return loc;
    }
	
	

	public static void main(String[] args) {
		int nums[] = {4,5,6,7,0,1,2};
		int key = 3;
//		if(search(nums,key)) System.out.println("true");
//		else System.out.println("false");
		System.out.println(search2(nums,key));
	}

}
