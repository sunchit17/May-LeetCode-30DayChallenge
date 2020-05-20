/*
Given a binary search tree,
write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:
Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> new_list =  new ArrayList<>();
        make_list(root,k,new_list);
        return new_list.get(k-1);
    }
    
    public static void make_list(TreeNode node, int k, ArrayList<Integer> new_list)
    {
        if(node==null)
            return;
        make_list(node.left,k,new_list);
        new_list.add(node.val);
        make_list(node.right,k,new_list);
    }
}
