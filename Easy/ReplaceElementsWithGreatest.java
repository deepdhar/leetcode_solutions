import java.util.Arrays;

//Replace Elements with Greatest Element on Right Side
public class ReplaceElementsWithGreatest {
	
	static int[] replaceElements(int[] arr) {
		int max = -1, temp;
        for (int i=arr.length-1; i>=0; --i) {
        	temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
	
	public static void main(String args[]) {
		int arr[] = {17,18,5,4,6,1};
		arr = replaceElements(arr);
		System.out.println(Arrays.toString(arr));
	}

}
