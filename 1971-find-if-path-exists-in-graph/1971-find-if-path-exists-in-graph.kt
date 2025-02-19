class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {

        if(source == destination) return true

        val adjList = mutableMapOf<Int, MutableList<Int>>()
        
        edges.forEach{ (first, second) ->
            adjList.computeIfAbsent(first) { mutableListOf() }.add(second)
            adjList.computeIfAbsent(second) { mutableListOf() }.add(first)
        }

        val seen = mutableSetOf<Int>() 

        val stack = ArrayDeque<Int>()
        stack.addLast(source)

        while(stack.isNotEmpty()){
            val node = stack.removeLast()
            if(node == destination) return true
            
            adjList[node]?.forEach { neighbor ->
                if(!seen.contains(neighbor)){
                    seen.add(neighbor)
                    stack.addLast(neighbor)
                }
            }
        }
        
        return false
    }
}