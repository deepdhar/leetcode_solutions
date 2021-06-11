
public class SortingSentence {
	
	static String sortSentence(String s) {
		String[] words = s.split(" "), ans = new String[words.length];
        for (String word : words) {
            int i = word.length() - 1;
            ans[word.charAt(i) - '1'] = word.substring(0, i);
        }
        return String.join(" ", ans);
    }

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}

}
