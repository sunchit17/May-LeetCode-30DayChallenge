/*
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num 
calculate the number of 1's in their binary representation and return them as an array.

Example 1:
Input: 2
Output: [0,1,1]

Example 2:
Input: 5
Output: [0,1,1,2,1,2]

Follow up:

- It is very easy to come up with a solution with run time O(n*sizeof(integer)).
- But can you do it in linear time O(n) /possibly in a single pass?
- Space complexity should be O(n).
- Can you do it like a boss? Do it without using any builtin function
*/

class Solution {
    public int[] countBits(int num) {
        
        int[] count_1s =  new int[num+1];
        count_1s[0] = 0;
        
        for(int i=1;i<count_1s.length;++i)
        {
            if(i%2==0)
                count_1s[i] = count_1s[i/2];
            else
                count_1s[i] = count_1s[i/2]+1;
        }
        
        return count_1s;
    }
}
