class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val map = mutableMapOf<Char, Int>()
        s.forEach{
            map[it] = map.getOrDefault(it, 0) + 1
        }

        t.forEach{
            val count = map[it] ?: 0
            if(count == 0) return false
            map[it] = count - 1
        }

        return true
    }
}