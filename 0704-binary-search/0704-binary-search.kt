class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0   
        var right = nums.lastIndex
        while(left <= right){
            val mid = left + (right - left)/2
            val midVal = nums[mid]
            if(target == midVal) return mid
            if(target > midVal){
                left = mid + 1
            }
            else{
                right = mid - 1
            }
        }
        return -1
    }
}