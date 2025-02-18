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
    var prev : Int? = null
    fun isValidBST(root: TreeNode?): Boolean {
       return inorder(root) 
    }
    
    private fun inorder(root: TreeNode?): Boolean{
        if(root == null) return true
        
           if(!inorder(root?.left)) return false
           prev?.let {
               if(root?.`val` <= it) return false
           }
           prev = root?.`val`
           return inorder(root?.right) 
    }

}