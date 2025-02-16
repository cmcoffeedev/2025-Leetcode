class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val restoredArray = CharArray(s.length)

        s.forEachIndexed{ index, char ->
            restoredArray[indices[index]] = char
        }
        
        return restoredArray.joinToString("")
    }
}