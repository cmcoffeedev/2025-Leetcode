class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // num to index
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed{ index, num -> 
            val complement = target - num
            map[complement]?.let{ complementIndex ->
                return intArrayOf(index, complementIndex)
            }
            map[num] = index
        }

        return intArrayOf(-1, -1)
    }
}