
public class Maximum69Number {
	
	static int maximum69Number (int num) {
        char arr[] = Integer.toString(num).toCharArray();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]=='6') {
        		arr[i] = '9'; 
        		break;
        	}
        }
        
        return Integer.parseInt(new String(arr));
    }
	
	public static void main(String args[]) {
		int num = 9666;
		System.out.println(maximum69Number(num));
	}

}
