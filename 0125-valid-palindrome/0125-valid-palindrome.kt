class Solution {
    fun isPalindrome(s: String): Boolean {

        val stack = ArrayDeque<Char>()

        for(char in s){
            if(!char.isLetterOrDigit()) continue
            stack.addLast(char.toLowerCase())
        }

        for(i in 0 until s.length){
            var current = s[i].toLowerCase()
            if(!current.isLetterOrDigit()) continue
            if(stack.removeLast() != current) return false
        }
        if(stack.isNotEmpty()) return false

        return true
    }
}