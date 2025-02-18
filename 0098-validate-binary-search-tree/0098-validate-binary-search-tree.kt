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
        return traverseDFS(root, null, null)
    }

    fun traverseDFS(root: TreeNode?, min: Int?, max: Int?) : Boolean{
        if (root == null) return true 
        if(max != null && root.`val` >= max) return false
        if(min != null && root.`val` <= min) return false

        return traverseDFS(root?.left, min, root?.`val`) &&
        traverseDFS(root?.right, root?.`val`, max)
    }

}