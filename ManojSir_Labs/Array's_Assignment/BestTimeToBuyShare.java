import java.util.*;
public class BestTimeToBuyShare{
	
	public static int maxProfit(int prices[]){
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		
		for(int price : prices){
			if(price < minPrice){
				minPrice = price; // updation of minimum price
			}
			else if(price - minPrice > maxProfit){
				maxProfit = price - minPrice; // updated minimum price to maxProfit
			}
		}
		return maxProfit;
	}
	
	public static void main(String args[]){
		int prices[] = {7, 1, 5, 3, 6, 4};
		
		maxProfit(prices);
		
		System.out.println("Maximum profit is: " + maxProfit(prices));
	}
}