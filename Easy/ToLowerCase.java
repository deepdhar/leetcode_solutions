//convert a string to lower case without using String.toLowerCase();
public class ToLowerCase {
	
	static String toLowerCase(String str) {
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				arr[i] += 32;
		}
		return String.valueOf(arr);
	}
	
	public static void main(String args[]) {
		String s = "Hello Dear";
		System.out.println(toLowerCase(s));
	}

}
