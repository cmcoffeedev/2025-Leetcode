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
       val queue = ArrayDeque<TreeNode?>() 
       val levelList = mutableListOf<MutableList<Int>>()
       if(root == null) return levelList 
       queue.add(root)
       while(queue.isNotEmpty()){
           val size = queue.size
           val list = mutableListOf<Int>()
           for(i in 0 until size){
               val item = queue.removeFirst()
               item?.let{ list.add(it.`val`) }   
               item?.left?.let{
                   queue.add(it)
               }
               item?.right?.let{
                   queue.add(it)
               }
           }
           levelList.add(list)
       }
       return levelList
    }
}