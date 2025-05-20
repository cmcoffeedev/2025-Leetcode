class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int,Int>()

        for(num in nums){
            map[num] = map.getOrDefault(num, 0) + 1
        }

        val pq = PriorityQueue<Int>(compareBy{map[it]})

        map.forEach{ key, size ->
            pq.add(key)
            if(pq.size > k) pq.poll()
        }

        val arr = IntArray(k)
        for(i in 0 until k){
            arr[i] = pq.poll()
        }

        return arr
    }
}