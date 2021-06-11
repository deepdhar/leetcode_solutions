
public class TruncateSentence {
	
	static String truncateSentence(String s, int k) {
		String words[] = s.split(" ");
		String arr[] = new String[k];
		int i=0;
		while(i<k) {
			arr[i] = words[i];
			i++;
		}
		return String.join(" ", arr);
    }

	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k = 4;
		System.out.println(truncateSentence(s, k));
	}

}
