// Number Of Rectangles That Can Form The Largest Square
import java.util.*;
public class NumberOfRectangles {
	
	static int countGoodRectangles(int[][] rectangles) {
		int length[] = new int[rectangles.length];
        for(int i=0; i<rectangles.length; i++) {
        	int res = Math.min(rectangles[i][0],rectangles[i][1]);
        	length[i] = res;
        }
        
        int max = 0;
        for(int i=0; i<length.length; i++) max = Math.max(max, length[i]);
        
        int count = 0;
        for(int i=0; i<length.length; i++) if(length[i]==max) count++;
        
        return count;
    }

	public static void main(String[] args) {
		int arr[][] = {{5,8},{3,9},{5,12},{16,5}};
		System.out.println(countGoodRectangles(arr));
	}

}
