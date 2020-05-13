/*
Given a non-negative integer num represented as a string, 
remove k digits from the number so that the new number is the smallest possible.

Input: num = "10200", k = 1
Output: "200"

Input: num = "10", k = 2
Output: "0"

Input: num = "5337", k = 2
Output: "33"

*/

class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)
            return "0";
        
        StringBuilder s =  new StringBuilder(num);
        
        for(int i=0;i<k;i++)
        {
            int j=0;
            while(j<s.length()-1 && s.charAt(j)<=s.charAt(j+1)){
                j++;
            }
            s.delete(j,j+1);
        }
        
        while(s.length()>1 && s.charAt(0)=='0')
            s.delete(0,1);
        if(s.length()==0)
            return "0";
        
        return s.toString();
    }
}
