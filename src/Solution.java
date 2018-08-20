

import java.util.ArrayList;
import java.util.Hashtable;

class Solution 
{
	
	
	//Dynamic programming solution for buying and selling stock.
	public static int maxProfit(int[] prices) 
	{       
        if(prices.length==0)
        {
            return 0;
        }
        
        int buy =0;
        buy = prices[0];
        //sell = prices[0];
        int profit = 0;
        int i = 1;
        while(i<prices.length)
        {            
            if(prices[i]<buy)	//if price is less than previous buy price then we buy here
            {
                buy = prices[i];
            }
            if((prices[i] - buy) > profit)	// calculate the profit for every buy price that we have and if profit is more then we sell here.
            {
                profit = prices[i] - buy;                
            }            
            i++;
        }
        return profit;       
    }
	

		
	//Greedy first algorithm to solve the problem of coin change
	public static ArrayList<Integer> change(int no)
	{
		int n = no;
		int quarters = n/25;
		//System.out.println(n);
		n = n%25;
		//System.out.println(n);
		int dimes = n/10;
		n = n%10;
		//System.out.println(n);
		int nickels = n/5;
		n=n%5;
		//System.out.println(n);
		int pennies = n;
		ArrayList<Integer> l = new ArrayList<>();
		l.add(quarters);
		l.add(dimes);
		l.add(nickels);
		l.add(pennies);
		System.out.println("Quarters:  "+quarters+" Dimes: "+dimes+" Nickels: "+nickels+" Pennies: "+pennies);
		return l;
	}
		
	
	

}
