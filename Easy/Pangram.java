
public class Pangram {
	
	static boolean isPangram(String s) {
		int cnt[] = new int[26], total = 0;
	    for (var ch: s.toCharArray())
	        if (++cnt[ch-'a'] == 1)
	            total++;
	    return total == 26;
	}

	public static void main(String[] args) {
		String s = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(isPangram(s));
	}

}
