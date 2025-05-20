class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var longest = 0
        var left = 0
        val set = mutableSetOf<Char>()
        s.forEachIndexed{right, char ->
            while(set.contains(char)){
                set.remove(s[left++])
            }
            set.add(char)
            longest = maxOf(longest, (right - left) + 1) 
        }
        return longest
    }
}