/*
Given an array of size n, find the majority element. 
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3

Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2

*/

// import java.util.Collections;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/2;
        int j = 0;
        int i;
        for(i=0;i<nums.length;i++)
        {  
            if(map.containsKey(nums[i]))    
                map.put(nums[i], map.get(nums[i]) + 1); 
            else
                map.put(nums[i],1);
            j = map.get(nums[i]);
            if(j>n)
                break;
        }
        return nums[i];
    }
}
