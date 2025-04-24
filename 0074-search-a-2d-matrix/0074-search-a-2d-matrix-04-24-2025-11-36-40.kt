class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        for(arr in matrix){
            var left = 0
            var right = arr.lastIndex
            while(left <= right){
                val mid = left + (right - left)/2
                if(arr[mid] == target) return true
                if(arr[mid] < target){
                    left = mid + 1
                }
                else{
                    right = mid - 1
                }
            }
        }
        
        return false
    }
}