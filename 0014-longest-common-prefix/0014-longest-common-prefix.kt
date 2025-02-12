class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val map = mutableMapOf<String, Int>()

        var lcp = ""
        strs.forEach{ item ->
            val strBuilder = StringBuilder()
            item.forEach{ char ->
                strBuilder.append(char)
                val str = strBuilder.toString()
                map[str] = map.getOrDefault(str, 0) + 1
                var size = map[str] ?: 0
                if(size >= strs.size && str.length > lcp.length) lcp = str 
            }
        }

        return lcp
    }
}