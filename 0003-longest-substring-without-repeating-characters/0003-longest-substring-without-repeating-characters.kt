class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = mutableSetOf<Char>()
        var left = 0
        var max = 0

        s.forEachIndexed { right, char -> 
            while(set.contains(char) && left < right){
               set.remove(s[left++]) 
            }
            set.add(char)
            max = Math.max(max, (right - left) + 1)
        }
        return max
    }
}