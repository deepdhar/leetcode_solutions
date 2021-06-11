
public class FlipAndInvertImage {
	
	static int[][] flipAndInvertImage(int[][] image) {
		//flipping
        for(int row=0; row<image.length; row++) {
        	int i=0, j=image[row].length-1;
            while(i<j) {
            	int temp = image[row][i];
            	image[row][i] = image[row][j];
            	image[row][j] = temp;
            	i++;
            	j--;
            }
        }
        
        //inverting
        for(int row=0; row<image.length; row++) {
        	for(int col=0; col<image[row].length; col++) {
        		if(image[row][col]==0) image[row][col] = 1;
        		else image[row][col] = 0;
        	}
        }
        
        return image;
    }

	public static void main(String[] args) {
		int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		image = flipAndInvertImage(image);
		
        //printing
        for(int row=0; row<image.length; row++) {
        	for(int col=0; col<image[row].length; col++) {
        		System.out.print(image[row][col] + " ");
        	}
        	System.out.println();
        }
	}

}
