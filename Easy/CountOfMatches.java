
public class CountOfMatches {
	
	static int numberOfMatches(int n) { 
		int count=0;
		while(n!=1) {
			if((n&1)==1) {
				count += (n-1)/2;
				n = ((n-1)/2)+1;
			} else {
				count += n/2;
				n = n/2;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int n = 14;
		System.out.println(numberOfMatches(n));
		String s = "Hello";
		System.out.println(s.toLowerCase());
	}
	
}
