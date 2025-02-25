class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        val map = mutableMapOf<Int,Int>()
        
        nums.forEach{ num ->
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        val pq = PriorityQueue<Int>( compareBy{ map[it] } )
        
        for(key in map.keys){
            pq.offer(key)
            if(pq.size > k) pq.poll()
        }
        
        val topK = IntArray(k)
        for(i in 0 until k) topK[i] = pq.poll()
        
        return topK
    }
}