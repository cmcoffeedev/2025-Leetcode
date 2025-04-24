class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size

        for(row in matrix){
            for(value in row){
                if(value == target)return true
            }
        }
        
        return false
    }
}