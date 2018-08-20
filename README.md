# Test-Solution

## Getting Started
The instructions are given below to execute the code. The details about API's are also given.

### Prerequisites
Should have Java virtual machine or Java run time environment 1.8

## Execution
By default the code will execute coin change method for numbers ranging from 0 to 1000
By default the stock buying/selling method will run for 1000 times with 10 different random integers.
```
Java TestSolution
```

### API's
The class Solution has two static methods designed to return the solution for stock prices and coin change problem.

```
Solution.maxprofit(int[] n) 
```
This method will take up array of positive integer inputs (limited to ten in this case, but can take up any number of integers)
Return the max profit as int.

```
Solution.change(int n) 
```
This method will take up a positive integer number as input
Return ArrayList<Integer> with Quarters, Dimes, Nickels, Pennies in that order.
Also prints them in the same order.

### Testing
The code tested by running it against set of positive integers. 
More cases can be added to catch exceptions for negative numbers, nulls and empty arrays.
