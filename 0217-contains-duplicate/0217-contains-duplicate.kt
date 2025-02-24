class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        nums.forEach{num -> 
            if(set.contains(num)) return true
            set.add(num)
        }
        return false
    }
}