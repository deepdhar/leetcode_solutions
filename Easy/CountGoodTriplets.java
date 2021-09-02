
public class CountGoodTriplets {
	
	static int countGoodTriplets(int[] arr, int a, int b, int c) {
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					for(int k=j+1; k<arr.length; k++) {
						if((Math.abs(arr[i]-arr[j]) <= a) && (Math.abs(arr[j]-arr[k]) <= b) && (Math.abs(arr[i]-arr[k]) <= c))
							count++;
					}
				}
			}
			return count;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,1,2,2,3};
		int a=0, b=0, c=1;
		System.out.println(countGoodTriplets(arr, a, b, c));
	}

}
