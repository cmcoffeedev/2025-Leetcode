class Solution {
    fun longestPalindrome(s: String): Int {
        var longest = 0
        val arr = IntArray(128)
        for(char in s){
            arr[char.code]++
            if(arr[char.code] % 2 == 0) longest += 2
        }
        return if(longest != s.length) longest + 1 else longest
    }
}