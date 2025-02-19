class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {

        if(source == destination) return true

        val adjList = mutableMapOf<Int, MutableList<Int>>()

        edges.forEach{ (first, second) ->
            adjList.computeIfAbsent(first) { mutableListOf() }.add(second)
            adjList.computeIfAbsent(second) { mutableListOf() }.add(first)
        }

        val seen = mutableSetOf<Int>() 

        val queue = ArrayDeque<Int>().apply { addLast(source) }

        while(queue.isNotEmpty()){
            val node = queue.removeFirst()
            if(node == destination) return true
            
            adjList[node]?.forEach { neighbor ->
                if(!seen.contains(neighbor)){
                    seen.add(neighbor)
                    queue.addLast(neighbor)
                }
            }
        }
        
        return false
    }
}