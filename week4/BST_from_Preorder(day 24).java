/*
Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node,
any descendant of node.left has a value < node.val,
and any descendant of node.right has a value > node.val.
Also recall that a preorder traversal displays the value of the node first,
then traverses node.left, then traverses node.right.)

Example:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]
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
    
    int i=0;
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return bstFromPreorder(preorder,Integer.MAX_VALUE);
    }
    
    private TreeNode bstFromPreorder(int[] preorder,int max)
    {
        if(i==preorder.length || preorder[i]>max)
            return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = bstFromPreorder(preorder,root.val);
        root.right = bstFromPreorder(preorder,max);
        return root;
    }
}
