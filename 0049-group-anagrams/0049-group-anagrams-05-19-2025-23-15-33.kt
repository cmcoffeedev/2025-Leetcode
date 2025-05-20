class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String> >()
        strs.forEach{ word ->
            // array to set count of each letter
            val freqCharArr = IntArray(26){0}
            word.forEach{ char ->
                // increase freq of current char
                freqCharArr[char - 'a']++
            }
            //create unique key to use in map
            val key = freqCharArr.joinToString("#")
            map.computeIfAbsent(key) { mutableListOf() }.add(word)
        }
        return map.values.toList()
    }
}