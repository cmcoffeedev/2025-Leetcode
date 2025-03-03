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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        return inorder(root, mutableListOf<Int>())
    }

    fun inorder(root: TreeNode?, list: MutableList<Int>): List<Int>{
        var value = root?.`val` ?: return list
        inorder(root?.left, list)
        list.add(value)
        inorder(root?.right, list)
        return list
    }
}