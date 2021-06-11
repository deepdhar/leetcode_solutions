import java.util.*;
public class NumberOfSteps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(numberOfStepsCount(n));
		scan.close();
	}
	
	static int numberOfStepsCount(int num) {
        int count=0;
		while(num!=0) {
			if((num^1) == num+1)
				num = num/2;
			else
				num = num - 1;
			count++;
		}
		return count;
    }

}
