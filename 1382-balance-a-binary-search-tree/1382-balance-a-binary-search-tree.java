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
    List<TreeNode> list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        dfs(root);
        TreeNode mid = list.get((list.size())/2);
          
        return build(0,list.size()-1);
    }
    public void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
 public TreeNode build(int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = list.get(mid);

        root.left = build(left, mid - 1);
        root.right = build(mid + 1, right);

        return root;
    }
}