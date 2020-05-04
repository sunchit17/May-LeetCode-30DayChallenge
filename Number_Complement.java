/*

Given a positive integer, output its complement number.
The complement strategy is to flip the bits of its binary representation.

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), 
and its complement is 010. So you need to output 2.

*/

class Solution {
    public int findComplement(int num) {
        int bit;
        int converted=0;
        int t=0;
        while(num>0)
        {
            bit=num%2;
            num/=2;
            if(bit==0)
                converted+=Math.pow(2,t);
            t++;
        }
        return converted;
    }
}
