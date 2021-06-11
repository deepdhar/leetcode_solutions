
public class GoalParser {
	
	static String Goal(String s) {
		char[] arr = s.toCharArray(); 
		String t = "";
		for(int i=0; i<s.length(); i++) {
			if(arr[i]=='(') {
				if(arr[i+1]==')')
					t += "o";
				else
					continue;
			}
			else if(arr[i]==')')
				continue;
			else
				t += arr[i];
		}
		return t;
	}

	public static void main(String[] args) {
		String s = "G()()()()(al)";
		System.out.println(Goal(s));
	}

}
