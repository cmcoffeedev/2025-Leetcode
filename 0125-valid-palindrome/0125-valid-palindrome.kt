class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length-1

        while(start < end){
            if( !s[start].isLetterOrDigit() ){
                start++
                continue
            } 
            if( !s[end].isLetterOrDigit() ){
                end--
                continue
            } 
            if(!s[start++].equals(s[end--], ignoreCase = true)) return false
        }

        return true
    }
}