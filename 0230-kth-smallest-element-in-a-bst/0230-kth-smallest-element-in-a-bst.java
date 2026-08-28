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
      int c;
      int res;
    public int kthSmallest(TreeNode root, int k) {
     
       inorder(root,k);
        return res;
    }
    public int  inorder(TreeNode root,int k){
   if(root==null){
    return 0;
   }
   
   inorder(root.left,k);
  c++;
  if(c==k){
    res= root.val;
    return 0;
   }
   inorder(root.right,k);
   return 0; }
}