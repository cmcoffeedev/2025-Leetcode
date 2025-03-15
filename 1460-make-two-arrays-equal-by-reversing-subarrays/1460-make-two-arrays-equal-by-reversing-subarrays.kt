class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
       val map = mutableMapOf<Int, Int>()
       for(num in target){
           map[num] = map.getOrDefault(num, 0) + 1
       } 
       for(num in arr){
           val count = map[num] ?: return false
           if(count == 0) return false
           map[num] = count - 1
       }

       return true
    }
}