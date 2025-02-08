class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val (shorter,longer) = if(nums1.size > nums2.size){
            nums2 to nums1
        }
        else{
            nums1 to nums2
        }
        
        val map = mutableMapOf<Int, Int>()
        
        shorter.forEach{
            map[it] = map.getOrDefault(it, 0) + 1
        }
        
        val list = mutableListOf<Int>()
        
        longer.forEach{
            map[it]?.let{ count ->
                if(count > 0){
                    list.add(it)
                    map[it] = count - 1
                }
            }
        }
        
        return list.toIntArray()
        
        
        
    }
}