
class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        val combinedNums = (nums1 + nums2).sortedArray()
        val half = combinedNums.size / 2;

        if(combinedNums.size % 2 != 0){
            return combinedNums[half].toDouble() 
        }

        val firstNum = combinedNums[half]
        val secondNum = combinedNums[half - 1]
        val sum = firstNum + secondNum
        
        return  sum.toDouble() / 2
    }
}