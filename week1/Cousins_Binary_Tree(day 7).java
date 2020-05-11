/*
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.

Example:

Input: root = [1,2,3,4], x = 4, y = 3
Output: false

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
    TreeNode xpt=null,ypt=null;
    int xdh=-1,ydh=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null,x,y,0);
        return xdh == ydh && xpt!=ypt;
    }
    void dfs(TreeNode root,TreeNode parent,int x,int y,int depth)
    {
        if(root==null)return;
        if(x==root.val)
        {
            xpt=parent;// assign the current parent to x
            xdh=depth;
        }
        else if(y==root.val)
        {
            ypt=parent;// assign the current parent to y
            ydh=depth;
        }
        else
        {
            dfs(root.left,root,x,y,depth+1);// check the left subtree
            dfs(root.right,root,x,y,depth+1);// check the right subtree
        }
        
    }
}
