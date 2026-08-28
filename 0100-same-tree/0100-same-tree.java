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
   

    public boolean isSameTree(TreeNode p, TreeNode q) {
         List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    if(p==null||q==null){
        return p==q;
    }
        bfs(p, l1);
    bfs(q, l2);
    
        return l1.equals(l2);
    }

    public void bfs(TreeNode p,List<Integer> l1) {

        Queue<TreeNode> q1 = new LinkedList<>();
      
        q1.offer(p);
        l1.add(p.val);
        while (!q1.isEmpty()) {
            TreeNode w = q1.poll();
            if (w == null) {
                l1.add(null);
                continue;
            }
            l1.add(w.val);
            q1.add(w.left);

            q1.add(w.right);
        }
        
    }
}