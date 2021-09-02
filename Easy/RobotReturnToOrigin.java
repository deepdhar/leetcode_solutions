
public class RobotReturnToOrigin {
	
	static boolean judgeCircle(String moves) {
		int x=0, y=0;
		char arr[] = moves.toCharArray();
		for(int i=0; i<moves.length(); i++) {
			if(arr[i]=='U') {
				x += 1;
				y += 1;
			}
			else if(arr[i]=='D') {
				x += -1;
				y += -1;
			}
			else if (arr[i]=='L') {
				x += -1;
			}
			else if (arr[i]=='R') {
				x += 1;
			}
		}
		if(x==0 && y==0) return true;
		else return false;
	}
	
	public static void main(String args[]) {
		String s = "LDRRULL";
		System.out.println(judgeCircle(s));
	}

}
