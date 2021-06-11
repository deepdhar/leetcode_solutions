
public class ShuffleTheArray {
	
	static int[] shuffle(int[] nums, int n) {
		int b[] = new int[nums.length];
		for(int i=0; i<n; i++) {
			b[2*i] = nums[i];
			b[2*i+1] = nums[n+i];
		}
		return b;
	}

	public static void main(String[] args) {
		int arr[] = {2,5,1,3,4,7};
		int n = 3;
		int brr[] = shuffle(arr, n);
		for(int i=0; i<brr.length; i++)
			System.out.print(brr[i] + " ");
		System.out.println();
	}

}
