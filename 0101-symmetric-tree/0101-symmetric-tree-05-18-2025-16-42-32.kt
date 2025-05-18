/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        val queue = ArrayDeque<TreeNode?>()
        queue.addLast(root?.left)
        queue.addLast(root?.right)
        while(queue.isNotEmpty()){
            val left = queue.removeFirst()
            val right = queue.removeFirst()

            if(left == null && right == null) continue 
            if(left == null || right == null) return false
            if(left.`val` != right.`val`) return false

            queue.addLast(left.left)
            queue.addLast(right.right)

            queue.addLast(left.right)
            queue.addLast(right.left)
        }
        return true
    }
}