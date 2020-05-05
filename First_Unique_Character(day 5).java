/*
Given a string, find the first non-repeating character in it and return it's index. 
If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

*/

class Solution {
    public int firstUniqChar(String s) {
        char [] count = new char[256];
        
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)]++;
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)]==1)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
