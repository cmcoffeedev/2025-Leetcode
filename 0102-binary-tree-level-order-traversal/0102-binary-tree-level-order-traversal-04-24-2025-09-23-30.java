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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null) return list;
        while(!queue.isEmpty()){
            int size = queue.size();
            
            List<Integer> levelList = new ArrayList<>();
            for(int i = 0;i < size;i++){
                TreeNode node = queue.removeFirst();
                levelList.add(node.val);
                if(node.left != null)queue.addLast(node.left);
                if(node.right != null)queue.addLast(node.right);
            }
            list.add(levelList);
        }
        return list;
    }
}