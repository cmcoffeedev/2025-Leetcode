class Solution {
    fun singleNumber(nums: IntArray): Int {
       var single = 0
       nums.forEach{ num ->
          single = single xor num 
       } 
       return single
    }
}