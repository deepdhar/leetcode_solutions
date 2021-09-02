
public class HeightChecker {
	
	static int heightChecker(int[] heights) {
		int[] heightToFreq = new int[101];
        
        for (int height : heights)
            heightToFreq[height]++;
        
        int result = 0;
        int curHeight = 0;
        
        for(int i=0; i<heights.length; i++) {
            while (heightToFreq[curHeight] == 0)	
                curHeight++;
            
            if (curHeight != heights[i])
                result++;
            
            heightToFreq[curHeight]--;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {5,1,2,3,4};
		System.out.println(heightChecker(arr));
	}

}
