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
    fun minDepth(root: TreeNode?): Int {
        if(root == null) return 0

        val queue = ArrayDeque<Pair<TreeNode?, Int>>()
        queue.addLast(Pair(root, 1))

        while(queue.isNotEmpty()){
            val (node, depth) = queue.removeFirst()
            if(node?.left == null && node?.right == null) return depth
            node?.left?.let{ queue.addLast( Pair(it, depth + 1) ) }
            node?.right?.let{ queue.addLast( Pair(it, depth + 1) ) }
        }

        return 0
    }
}