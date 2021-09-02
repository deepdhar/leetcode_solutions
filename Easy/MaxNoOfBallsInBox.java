
public class MaxNoOfBallsInBox {
	
	static int countBalls(int lowLimit, int highLimit) {
		int[] arr = new int[50];
		int max = 0;
		for(int i=lowLimit; i<=highLimit; i++) {
			int num = i, sum = 0;
			while(num>0) {
				sum += num % 10;
				num /= 10;
			}
			max = Math.max(++arr[sum], max);
		}
		return max;
	}
	
	public static void main(String args[]) {
		int lowLimit = 19, highLimit = 28;
		System.out.println(countBalls(lowLimit, highLimit));
	}

}
