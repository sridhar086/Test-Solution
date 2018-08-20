import java.util.Arrays;
import java.util.Random;

public class TestSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = {3,8,8,55,38,1,7,42,54,53};
    	
		
		//testing method for calculting maximum profit.
    	Random rand= new Random();
    	int max = Integer.MAX_VALUE;
    	int min = 1;
    	for(int i=0;i<1000;i++)
    	{
    		int[] arr = new int[10];
    		for(int j=0;j<10;j++)
    		{
    			arr[j] = rand.nextInt(max) + min;
    		}
    		System.out.println(Arrays.toString(arr));
    		System.out.println(Solution.maxProfit(arr));
 
    	}
    	//System.out.println(Solution.maxProfit(prices));
    	
        
    	/*
         * In USA, the cents are designed in such a way that the greedy first will give the optimal solution,
         * so there is no need to use dynamic programming for the given problem
         * Pennies, Dimes, Nickels, Quarters
         * 
         */    	
       
        //Method to test coin change problem
    	
    	for(int i=0;i< 1000;i++)
    	{
    		System.out.print(i+"   ");
        	Solution.change(i);	   //This is greedy first solution
    	}
    	
	}

}
