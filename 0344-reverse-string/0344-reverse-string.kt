class Solution {
    fun reverseString(s: CharArray): Unit {
        var start = 0
        var end = s.size-1
        while(start < end){
            val startChar = s[start]
            val endChar = s[end]
            s[start++] = endChar
            s[end--] = startChar
        }
        
    }
}