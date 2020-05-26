/*
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
In other words, one of the first string's permutations is the substring of the second string.

 

Example 1:
Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False

*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] arr = new int[26];
        int n = s1.length();
        int m = s2.length();
        
        if(n>m)
            return false;
        
        for(int i=0;i<n;i++)
        {
            arr[s2.charAt(i)-'a']++;
            arr[s1.charAt(i)-'a']--;
        }
        
        for(int i=n;i<m;i++)
        {
            if(compare(arr))
                return true;
            arr[s2.charAt(i)-'a']++;
            arr[s2.charAt(i-n)-'a']--;
        }
        if(compare(arr))
            return true;
        return false;
    }
    
    public static boolean compare(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}
