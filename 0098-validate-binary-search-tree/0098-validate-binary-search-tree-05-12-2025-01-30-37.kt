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
    fun isValidBST(root: TreeNode?): Boolean {
        // return recursiveDFS(root, null, null)
        return iterativeDFS(root)
    }

    fun recursiveDFS(root: TreeNode?, min: Int?, max: Int?) : Boolean{
        if(root == null) return true 
        if(max != null && root.`val` >= max) return false
        if(min != null && root.`val` <= min) return false

        return recursiveDFS(root?.left, min, root?.`val`) &&
        recursiveDFS(root?.right, root?.`val`, max)
    }

    fun iterativeDFS(root: TreeNode?) : Boolean{
        if(root == null) return true

        val stack = ArrayDeque<Triple<TreeNode, Int?, Int?>>()
        stack.addLast(Triple(root, null, null))

        while(stack.isNotEmpty()){
            val (node, min, max) = stack.removeLast()

            if(min != null && node.`val` <= min) return false
            if(max != null && node.`val` >= max) return false

            
            node?.right?.let{
                stack.addLast(
                    Triple(it, node?.`val`, max)
                )
            }
            node?.left?.let{
                stack.addLast(
                    Triple(it, min, node?.`val`)
                )
            }
        }

        return true
    }

}