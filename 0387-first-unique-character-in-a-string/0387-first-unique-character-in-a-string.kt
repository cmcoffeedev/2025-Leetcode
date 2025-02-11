class Solution {
    fun firstUniqChar(s: String): Int {
        val map = mutableMapOf<Char,Int>()
        s.forEach { char ->
            map[char] = map.getOrDefault(char, 0) + 1
        }
        
        s.forEachIndexed{ index, value ->
            map[value]?.let{ size ->
                if(size == 1) return index
            }
        }
        
        return -1
    }
}