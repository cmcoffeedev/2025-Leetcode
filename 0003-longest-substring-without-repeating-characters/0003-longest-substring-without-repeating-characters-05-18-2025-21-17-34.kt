class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
       val set = HashSet<Char>() 
       var longest = 0
       var left = 0
       s.forEachIndexed{right, char ->
          while(set.contains(char) && left < right){
             set.remove(s[left++])
          } 
          set.add(char)
          longest = Math.max(longest, (right - left) + 1)
       }
       return longest
    }
}