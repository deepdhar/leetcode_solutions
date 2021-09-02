
public class RemoveAllAdjacentDuplicatesInString {
	
	static String removeDuplicates(String s) {
		StringBuilder t = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = t.length();
            if (n > 0 && t.charAt(n-1) == c) { 
                t.deleteCharAt(n-1); 
            } else { 
                t.append(c); 
            }
        }
        return t.toString();
	}
	
	public static void main(String args[]) {
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}

}
