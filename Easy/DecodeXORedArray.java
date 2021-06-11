import java.util.Arrays;

public class DecodeXORedArray {
	
	static int[] decode(int[] encoded, int first) {
        int n = encoded.length, res[] = new int[n+1];
        res[0] = first;
        for (int i=0; i<n; i++)
            res[i+1] = res[i] ^ encoded[i];
        return res;
    }

	public static void main(String[] args) {
		int arr[] = {6,2,7,3};
		arr = decode(arr, 4);
		System.out.println(Arrays.toString(arr));
	}

}
