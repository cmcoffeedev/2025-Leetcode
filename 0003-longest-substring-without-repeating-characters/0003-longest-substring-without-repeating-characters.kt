class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var longest = 0
        var left = 0
        val set = ArrayDeque<Char>()

        s.forEachIndexed { right, char ->
            while(set.contains(char) && left < right){
                set.remove(s[left])
                left++
            }
            set.add(char)
            longest = Math.max(longest, (right - left) + 1)
        }

        return longest
    }
}