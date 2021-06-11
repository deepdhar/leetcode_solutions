
public class JewelsOrStones {
	
	public static int numJewelsInStones(String jewels, String stones) {
		char j[] = jewels.toCharArray(), s[] = stones.toCharArray();
		int count=0;
		for(int i=0; i<j.length; i++) {
			for(int k=0; k<s.length; k++)
				if(s[k]==j[i]) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String jewels = "z", stones = "ZZ";
		System.out.println(numJewelsInStones(jewels, stones));
	}

}
