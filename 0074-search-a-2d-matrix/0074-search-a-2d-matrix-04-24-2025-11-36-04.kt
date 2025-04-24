class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size

        for(row in matrix){
            row.forEach{ value ->
                if(value == target)return true
            }
        }
        
        return false
    }
}