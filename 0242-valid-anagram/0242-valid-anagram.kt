class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length) return false

        val map = mutableMapOf<Char, Int>()
        s.forEach{char ->
            map[char] = map.getOrDefault(char, 0) + 1
        }

        t.forEach{ char ->
            val count = map[char] ?: return false
            if(count == 0) return false
            map[char] = count - 1
        }

        return true
    }
}