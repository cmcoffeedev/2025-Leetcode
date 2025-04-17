class Solution {
    fun singleNumber(nums: IntArray): Int {
        var singleNum = 0
        nums.forEach{
            singleNum = singleNum xor it 
        }
        return singleNum
        
    }
}