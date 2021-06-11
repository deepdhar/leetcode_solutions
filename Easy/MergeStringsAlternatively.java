
public class MergeStringsAlternatively {
	
	static String mergeAlternately(String word1, String word2) {
		int count1 = 0, count2 = 0;
		int len1 = word1.length(), len2 = word2.length();
		String res = "";
		
		if(len2>=len1) {
			for(int i=0; i<len2; i++) {
				if(count1!=len1) {
					res += word1.charAt(i);
					count1++;
				}
				if(count2 != len2) {
					res += word2.charAt(i);
					count2 ++;
				}
			}
		} 
		else if(len2<len1) {
			for(int i=0; i<len1; i++) {
				if(count1!=len1) {
					res += word1.charAt(i);
					count1++;
				}
				if(count2 != len2) {
					res += word2.charAt(i);
					count2 ++;
				}
			}
		}
		
		return res;
		
    }

	public static void main(String[] args) {
		String word1 = "ab", word2 = "pqrs";
		
		System.out.println(mergeAlternately(word1, word2));
	}

}
