/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:
Input: 16
Output: true

Example 2:
Input: 14
Output: false
*/

// Naive Solution(Exceeds Time Limit):

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=0)
            return false;
        else if(num==1)
            return true;
        else
        {
            for(int i=1;i<=num/2;i++)
            {
                if(num%i==0&&num/i==i)
                    return true;
            }
            return false;
        }
        
    }
}


// Optimized Solution(Using Binary Search):

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        
        long i = 1, j = num;
		    while (i <= j) 
        {
			    long mid = i + (j - i) / 2;
			     if (mid * mid == num)
				      return true;
			     else if (mid * mid < num)
				      i = mid + 1;
			     else
				      j = mid - 1;
	    	}
		return false;    
    }
}
