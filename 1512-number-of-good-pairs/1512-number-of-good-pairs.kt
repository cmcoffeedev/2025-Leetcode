class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        val freqArr = IntArray(101)
        var count = 0
        for(num in nums){
            count += freqArr[num]
            freqArr[num]++
        }
        return count
    }
}