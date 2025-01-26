class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0
        for(i in 1 until nums.size){
            val current = nums[i]
            val prev = nums[k]
            if(current > prev){
                nums[++k] = current
            }  
        }
        return k+1
    }
}