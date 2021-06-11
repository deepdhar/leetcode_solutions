
public class CheckTwoStringArrays {
	
	static boolean checkArrays(String[] arr, String[] brr) {
		String a = "", b = "";
		for(int i=0; i<arr.length; i++)
			a = a + arr[i];
		for(int i=0; i<brr.length; i++)
			b = b + brr[i];
		
		if(a.equals(b)) return true;
		else return false;
	}

	public static void main(String[] args) {
		String a[] = {"abc", "d", "defg"}, b[] = {"abcddefg"};
		System.out.println(checkArrays(a, b));
	}

}
