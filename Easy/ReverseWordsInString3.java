import java.util.Arrays;


public class ReverseWordsInString3 {
	
	static String reverseWords(String s) {
		String words[] = s.split(" ");
		String res = "";
		for(int i=0; i<words.length; i++) {
			if(i!=words.length-1)
				res = res + reverseString(words[i]) + " ";
			else
				res += reverseString(words[i]);
		}
		return res;
    }
	
	static String reverseString(String x) {
		char arr[] = x.toCharArray();
		char rev[] = new char[x.length()];
		String t = "";
		for(int i=0; i<arr.length; i++)
			rev[x.length()-1-i] = arr[i];
		for(char r : rev)
			t += r;
		return t;
	}
	
	public static void main(String args[]) {
		String sentence = "Let's take Leetcode Contest";
		System.out.println(reverseWords(sentence));
	}
}
