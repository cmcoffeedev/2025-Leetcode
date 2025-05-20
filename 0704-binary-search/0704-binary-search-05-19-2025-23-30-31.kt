class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex
        while(left <= right){
            val mid = left + (right - left) / 2 
            val midNum = nums[mid]
            if(midNum == target) return mid
            if(midNum < target){
                left = mid + 1
            }
            else{
                right = mid - 1
            }
        }
        return -1
    }
}