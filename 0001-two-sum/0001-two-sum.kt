class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        /*
        Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        */

        val map = mutableMapOf<Int, Int>()
        for(i in 0 until nums.size){
            val current = nums[i]
            val complement = target - current
            if(map.containsKey(complement)){
                map[complement]?.let{ index ->
                    return intArrayOf(index, i)
                }
            }
            map[current] = i
        }
        
        return intArrayOf(-1,-1)
        
    }
}