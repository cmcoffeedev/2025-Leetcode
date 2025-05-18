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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        // gives runtime error on addLast(left.left)
        // Deque<TreeNode> queue = new ArrayDeque<>();
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root.left);
        queue.addLast(root.right);
        
        while(!queue.isEmpty()){
            TreeNode one = queue.removeFirst();
            TreeNode two = queue.removeFirst();
            
            if(one == null && two == null) continue;
            if(one == null || two == null) return false;
            if(one.val != two.val) return false;
            
            queue.addLast(one.left);
            queue.addLast(two.right);
            
            queue.addLast(one.right);
            queue.addLast(two.left);
        }
        
        return true;
    }
}