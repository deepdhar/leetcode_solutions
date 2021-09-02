
public class CheckSummationOfTwoWords {
	
	static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		int f = letterValue(firstWord), s = letterValue(secondWord), t = letterValue(targetWord);
		if((f + s) == t)
			return true;
		else
			return false;
	}
	
	static int letterValue(String s) {
		int res = 0;
		for(int i=0; i<s.length(); i++) {
			int j = s.charAt(i) - 97;
			res = (res * 10) + j;
		}
		return res;
	}
	
	public static void main(String args[]) {
		String firstWord = "acb", secondWord = "cba", targetWord = "cdb";
		System.out.println(isSumEqual(firstWord, secondWord, targetWord));
	}

}
