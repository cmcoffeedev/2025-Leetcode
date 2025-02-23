class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        var max = 1
        val dp = IntArray(nums.size){1}

        for(right in 1 until nums.size){
            for(left in 0 until right){
                var leftNum = nums[left]
                var rightNum = nums[right]
                if(rightNum > leftNum){
                    dp[right] = maxOf(dp[right], dp[left] + 1)
                }
            }
            max = maxOf(max, dp[right])
        }

        return max
    }
}