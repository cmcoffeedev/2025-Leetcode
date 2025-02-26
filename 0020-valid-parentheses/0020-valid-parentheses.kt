class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf<Char, Char>(
            '}' to '{',
            ')' to '(',
            ']' to '[',
        )

        val stack = ArrayDeque<Char>()

        s.forEach{ char ->
            map[char]?.let { removedChar ->
                if(stack.isEmpty() || stack.removeLast() != removedChar) return false
            } ?: stack.addLast(char)
        }
        return if(stack.isEmpty()) true else false
    }
}