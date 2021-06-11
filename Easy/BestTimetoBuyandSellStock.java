
public class BestTimetoBuyandSellStock {
	
	static int maxProfit(int[] prices) {
		int profit = 0, ele = 0;
        for(int i=0; i<prices.length-1; i++) {
        	int curr_profit = 0;
        	if(prices[i]<prices[i+1]) {
        		curr_profit = prices[i+1] - prices[i];
        		if(curr_profit > profit) {
        			ele = prices[i+1];
        			profit = curr_profit;
        		}
        	}
        }
        return ele;
    }

	public static void main(String[] args) {
		int arr[] = {7,6,4,3,1};
		System.out.println(maxProfit(arr));
	}

}
