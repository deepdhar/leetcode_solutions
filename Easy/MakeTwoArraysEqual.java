import java.util.Arrays;

public class MakeTwoArraysEqual {
	
	static boolean canBeEqual(int[] target, int[] arr) {
		Arrays.sort(target);
		Arrays.sort(arr);
		int flag = 0;
		for(int i=0; i<target.length; i++)
			if(target[i]!=arr[i]) flag = 1;
		
		if(flag==1) return false;
		else return true;
	}
	
	public static void main(String[] args) {
		int[] target = {7,3,9}, arr = {3,9,11};
		System.out.println(canBeEqual(target, arr));
	}

}
