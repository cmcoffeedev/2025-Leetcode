class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var minLen = Int.MAX_VALUE

        for(s in strs){
            minLen = minOf(minLen, s.length)
        }

        var i = 0
        while(i < minLen){
            for(s in strs){
                if(s[i] != strs[0][i]){
                    return s.substring(0, i)
                }
            }
            i++
        }

        return strs[0].substring(0, i)
    }
}