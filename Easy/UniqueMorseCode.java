import java.util.*;

public class UniqueMorseCode {
	
	static int uniqueMorseRepresentations(String[] words) {		
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();	//hashset doesn't allow duplicates
        for(String w : words) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<w.length(); ++i)
                sb.append(morse[w.charAt(i) - 'a']);
            s.add(sb.toString());
        }
        return s.size();
    }

	public static void main(String[] args) {
		String words[] = {"gin", "zen", "gig", "msg", "hono", "lulu", "gin"};
		System.out.println(uniqueMorseRepresentations(words));
	}

}
