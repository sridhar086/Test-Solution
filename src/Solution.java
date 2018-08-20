

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
        buy = prices[0];    //chosen first element of array as buying price
        //sell = prices[0];
        int profit = 0;		// initial profit is 0
        int i = 1;
        while(i<prices.length)
        {            
            if(prices[i]<buy)	//if price is less than previous buy price then we buy here
            {
                buy = prices[i];
            }
            if((prices[i] - buy) > profit)	// calculate the profit for every buy price that we have and if profit is more then we sell here.
            {
                profit = prices[i] - buy;  //if profit at current selling price is greater than the existing profit - then this is new profit.       
            }            
            i++;
        }
        return profit;       
    }
	

		
	//Greedy first algorithm to solve the problem of coin change
	public static ArrayList<Integer> change(int no)
	{
		int n = no;
		int quarters = n/25;		//Divide by 25 to find out no of quarter
		//System.out.println(n);
		n = n%25;					//remaining cents after taking out quarter coins
		//System.out.println(n);
		int dimes = n/10;			// Divide by 10 to find out no of dimes
		n = n%10;					//remaining cents after taking out dime coins
		//System.out.println(n);
		int nickels = n/5;			// Divide by 5 to find out no of nickels
		n=n%5;						//remaining cents after taking out nickel coins
		//System.out.println(n);
		int pennies = n;			//remaining cents are no of pennies
		ArrayList<Integer> l = new ArrayList<>();
		l.add(quarters);
		l.add(dimes);
		l.add(nickels);
		l.add(pennies);
		System.out.println("Quarters:  "+quarters+" Dimes: "+dimes+" Nickels: "+nickels+" Pennies: "+pennies);
		return l;
	}
		
	
	

}
