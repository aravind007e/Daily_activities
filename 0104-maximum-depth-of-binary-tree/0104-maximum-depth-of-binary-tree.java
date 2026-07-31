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
    public static int height(TreeNode root,int ans){
         if(root==null) return 0;
         return 1+Math.max(height(root.left,ans),height(root.right,ans));
    }
    public int maxDepth(TreeNode root) {
        int ans=0;
        ans=height(root,ans);
        return ans;
    }
}