/* Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
*/

package Arrays101;

import java.util.Arrays;

public class DuplicateZeros {
	
	static void duplicateZeros(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i != arr.length-1) {
				if(arr[i]==0) {
					int val = arr[i];
					for(int j=i; j<arr.length-1; j++) {
						int temp = arr[j+1];
						arr[j+1] = val;
						val = temp;
					}
					i++;
				}
			}
		}
    }

	public static void main(String[] args) {
		int arr[] = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

}
