
public class NumbersWithEvenNumberOfDigits {
	
	static int findNumbers(int[] nums) {
		int count=0;
		for(int n: nums) {
			n = (int) Math.floor(Math.log10(n)+1);
			System.out.println(n);
			if((n&1)!=1) count++;
		}
		return count;
    }

	public static void main(String[] args) {
		int arr[] = {252};
		System.out.println(findNumbers(arr));
	}

}
