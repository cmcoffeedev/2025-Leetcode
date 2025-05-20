class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var shortestLength = 200
        strs.forEach{
            shortestLength = minOf(shortestLength, it.length)
        }

        var i = 0
        while(i < shortestLength){
            for(str in strs){
                if(str[i] != strs[0][i]) return str.substring(0,i)
            }
            i++
        }
        return strs[0].substring(0,i)
    }
}