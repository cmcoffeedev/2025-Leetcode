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
    Integer prev = null;

    public boolean isValidBST(TreeNode root) {
        return traverse(null, null, root);
    }

    public boolean traverse(Integer min, Integer max, TreeNode root){
        if(root == null) return true;
        if((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
        return traverse(min, root.val, root.left) && traverse(root.val, max, root.right);
    }
}