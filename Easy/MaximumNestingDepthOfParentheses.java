
public class MaximumNestingDepthOfParentheses {
	
	static int maxDepth(String s) {
		int res=0, curr=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(')
				res = Math.max(res, ++curr);
			if(s.charAt(i)==')')
				curr--;
		}
		return res;
    }
	
	public static void main(String args[]) {
		String s = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));
	}

}
