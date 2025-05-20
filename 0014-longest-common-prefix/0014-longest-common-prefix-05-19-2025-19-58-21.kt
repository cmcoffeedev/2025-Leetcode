class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var shortest = 200
        //get the smallest, because the lcf can't be bigger than that
        strs.forEach{  str ->
            shortest = minOf(shortest, str.length)
        }

        //use i to figure out the first invalid index
        //we need to return one of the strings from the 0 up to the char before i
        var i = 0
        while(i < shortest){
            for(str in strs){
                if(str[i] != strs[0][i]) return str.substring(0,i)
            }
            i++
        }

        return strs[0].substring(0,i)
    }
}