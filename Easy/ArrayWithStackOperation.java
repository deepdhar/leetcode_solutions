// Build an Array With Stack Operations
// problem link: https://leetcode.com/problems/build-an-array-with-stack-operations/

import java.util.List;
import java.util.ArrayList;

public class ArrayWithStackOperation {
	
	static List<String> buildArray(int[] target, int n) {
		List<String> list = new ArrayList<String>();
		for(int i=1; i<=n; i++) {
			int flag = 0;
			list.add("Push");
			for(int j=0; j<target.length; j++) {
				if(target[j]==i) flag = 1;
			}
			if(flag==0) list.add("Pop");
			if(i==target[target.length-1]) break;
		}
		
		return list;
        
    }
	
	public static void main(String args[]) {
		int[] target = {2,3,4};
		int n = 4;
		
		System.out.println(buildArray(target, n));
	}

}
