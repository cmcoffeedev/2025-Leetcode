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
    public boolean isValidBST(TreeNode root) {
        TreeNode prev = null;
        TreeNode current = root;
        Deque<TreeNode> stack = new ArrayDeque<>();
        
        while(stack.size() > 0 || current != null){
            
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            
            if(prev != null && current.val <= prev.val) return false;
            
            prev = current; 
            current = current.right;
        }
        return true;
    }
}