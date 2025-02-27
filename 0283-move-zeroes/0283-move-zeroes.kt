class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        for(i in 0 until nums.size){
            if(nums[i] != 0){
                nums[left] = nums[i]
                left++
            }
        }

        for(i in left until nums.size){
            nums[i] = 0
        }
    }
}