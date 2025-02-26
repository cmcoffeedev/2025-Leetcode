class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf<Char,Char>(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )

        val stack = ArrayDeque<Char>()

        s.forEach{ char ->
            if(map.containsKey(char)){
                if(stack.isEmpty() || map[char] != stack.removeFirst()) return false
            }
            else{
                stack.addFirst(char)
            }
        }

        return if( stack.isEmpty() ) true else false
        
    }
}