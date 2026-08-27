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
            int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        sum(root,0);
        return max;
    }
    public int  sum(TreeNode root, int currsum){
        if(root==null) return 0 ;
         int left= Math.max(sum(root.left , currsum),0);
         int right =Math.max(sum(root.right,currsum),0);
         max= Math.max(left+right+root.val,max);
         return    Math.max(right,left)+root.val;
    }
}