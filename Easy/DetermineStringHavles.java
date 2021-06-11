
public class DetermineStringHavles {
	
	static boolean halvesAreAlike(String s) {
		String a, b;
		a = s.substring(0,s.length()/2);
		b = s.substring(s.length()/2, s.length());
		char arr[] = a.toLowerCase().toCharArray();
		char brr[] = b.toLowerCase().toCharArray();
		
		int count_a=0, count_b=0;
		for(char c: arr) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count_a++;
		}
		
		for(char c: brr) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count_b++;
		}
		
		if(count_a == count_b) return true;
		else return false;
    }
	
	public static void main(String args[]) {
		String s = "AbCdEfGh";
		System.out.println(halvesAreAlike(s));
	}

}
