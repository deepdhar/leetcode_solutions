
public class HighestAltitude {
	
	static int largestAltitude(int[] gain) {
        int max_alt=0, curr_alt=0;
        for(int gains: gain) {
        	curr_alt += gains;
        	max_alt = Math.max(curr_alt, max_alt);
        }
        
        return max_alt;
    }

	public static void main(String[] args) {
		int arr[] = {-4,-3,-2,-1,4,3,2};
		System.out.println(largestAltitude(arr));
	}

}
