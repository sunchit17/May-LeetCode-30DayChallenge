/*
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map =  new HashMap<>();
        int count = 0, max_so_far = 0;
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++)
        {
            count += (nums[i]==1)?1:-1;
            if(map.containsKey(count))
            {
                max_so_far = Math.max(max_so_far,i-map.get(count));
            }
            else
                map.put(count,i);
        }
        
        return max_so_far;
    }
}
