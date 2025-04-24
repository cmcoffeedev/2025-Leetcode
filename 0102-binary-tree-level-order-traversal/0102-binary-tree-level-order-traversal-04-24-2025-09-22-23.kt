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
        val list = mutableListOf<List<Int>>()

        if(root == null) return list

        val queue = ArrayDeque<TreeNode?>() 
        queue.addFirst(root)

        while(queue.isNotEmpty()){
            val size = queue.size
            val levelList = mutableListOf<Int>()

            repeat(size){
                val node = queue.removeFirst()
    
                node?.`val`?.let{ levelList.add(it) }
    
                node?.left?.let{ queue.add(it) }
                node?.right?.let{ queue.add(it) }
            }
            list.add(levelList)
        }

        return list
        
    }
}