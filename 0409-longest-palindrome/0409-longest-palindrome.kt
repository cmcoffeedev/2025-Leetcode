class Solution {
    fun longestPalindrome(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        for (char in s) {
            map[char] = map.getOrDefault(char, 0) + 1
        }

        var len = 0
        var hasOdd = false

        for (count in map.values) {
            if (count % 2 == 0) {
                len += count
            } else {
                len += count - 1 // Take the largest even part
                hasOdd = true     // We can use one odd character in the center
            }
        }

        return if (hasOdd) len + 1 else len
    }
}
