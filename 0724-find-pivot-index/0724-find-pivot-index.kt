class Solution {
    fun pivotIndex(nums: IntArray): Int {
       var total = 0 
       var leftTotal = 0 
       nums.forEach{
           total += it
       }

       nums.forEachIndexed { index, num ->
           if(total - leftTotal - num == leftTotal) return index
           leftTotal += num
       }

       return -1
    }
}