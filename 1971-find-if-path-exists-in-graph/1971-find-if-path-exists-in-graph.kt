class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        if(source == destination) return true

        val adjList = mutableMapOf<Int, MutableList<Int>>()

        edges.forEach{ (first, second) ->
            adjList.computeIfAbsent(first) { mutableListOf() }.add(second)
            adjList.computeIfAbsent(second) { mutableListOf() }.add(first)
        }

        val seen = mutableSetOf<Int>() 

        return dfs(source, destination, adjList, seen)
    }

    fun dfs(
        source: Int,
        destination: Int,
        adjList: Map<Int, List<Int>>,
        seen: MutableSet<Int>
    ): Boolean{
        if(source == destination) return true
        seen.add(source)

        adjList[source]?.forEach { neighbor ->
            if(!seen.contains(neighbor)){
                if( dfs(neighbor, destination, adjList, seen) ){
                    return true
                }
            }
        }

        return false
    }
}