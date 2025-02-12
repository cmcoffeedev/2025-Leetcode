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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val queue =  LinkedList<TreeNode?>()
        val outerList = mutableListOf<List<Int>>()
        if(root == null) return outerList
        queue.offer(root)
        while(queue.isNotEmpty()){
            val innerList = mutableListOf<Int>()
            val size = queue.size
            for(i in 0 until size){
                val currentNode = queue.poll()
                currentNode?.let{ node ->
                    innerList.add(node?.`val`)
                    node.left?.let{ queue.offer(currentNode?.left) }
                    node.right?.let{ queue.offer(currentNode?.right) }
                }
            }
            outerList.add(innerList)
        }
        return outerList
    }
}