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
    HashMap<Integer,Integer> h;
    int pre=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        h=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            h.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }

    private TreeNode build(int[]preorder,int left,int right){
        if(left>right){
            return null;
        }

        int rootValue=preorder[pre++];
        TreeNode root=new TreeNode(rootValue);

        int mid=h.get(rootValue);

        root.left=build(preorder,left,mid-1);
        root.right=build(preorder,mid+1,right);
        return root;
    }
}