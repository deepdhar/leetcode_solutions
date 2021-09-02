/* Decrypt String from Alphabet to Integer Mapping*/

public class DecryptString {
	
	static String freqAlphabets(String s) {
		int n = s.length();
		String res = "";
		for(int i=0; i<n;) {
			if(i<n-2 && s.charAt(i+2)=='#') {
				int num = Integer.parseInt(s.substring(i,i+2));
				res += (char)(num + 96);
				i += 3;
				continue;
			}
			res += (char)(97 + s.charAt(i) - '1');
			i++;
		}
		return res;
	}
	
	public static void main(String args[]) {
		String s = "1326#";
		System.out.println(freqAlphabets(s));
	}

}
