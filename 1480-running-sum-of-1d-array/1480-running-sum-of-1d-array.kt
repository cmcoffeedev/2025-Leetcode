class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var total = 0
        val arr = IntArray(nums.size)
        nums.forEachIndexed{ index, num -> 
            total += num
            arr[index] = total
        }

        return arr
    }
}