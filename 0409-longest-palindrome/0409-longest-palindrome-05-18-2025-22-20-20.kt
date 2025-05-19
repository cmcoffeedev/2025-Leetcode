class Solution {
    fun longestPalindrome(s: String): Int {
        val arr = IntArray(128)
        var len = 0

        for(char in s){
            arr[char.code]++
            if(arr[char.code] % 2 == 0) len += 2
        }

        return if(s.length != len) len + 1 else len
       
    }
}
