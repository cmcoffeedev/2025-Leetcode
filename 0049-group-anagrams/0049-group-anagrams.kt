class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        strs.forEachIndexed{ index, word ->
            val sortedWord = word.toCharArray().sorted().joinToString("")
            if(!map.containsKey(sortedWord)) map[sortedWord] = mutableListOf<String>()
            map[sortedWord]?.add(word)
        }
        
        return map.values.toList()
    }
}