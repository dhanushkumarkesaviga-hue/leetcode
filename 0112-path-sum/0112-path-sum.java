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
    boolean flag  ;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        dfs(root,targetSum);
        return flag;

    }
    public void dfs(TreeNode root, int TargetSum){
        if(root== null){
            return ;
        }  
          

          int targetSum = TargetSum-root.val;
           if (targetSum==0 &&root.left == null && root.right == null) {
            this.flag= true;
            return;
        }
        dfs(root.left,targetSum);
 
         dfs(root.right,targetSum);
    }
}