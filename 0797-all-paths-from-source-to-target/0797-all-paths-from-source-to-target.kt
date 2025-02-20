class Solution {
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        val paths = mutableListOf<List<Int>>()
        val source = 0
        val target = graph.lastIndex

        val queue = ArrayDeque<List<Int>>()
        queue.addLast(listOf<Int>(source))

        while(queue.isNotEmpty()){
            val keyList = queue.removeFirst()
            val lastItem = keyList[keyList.lastIndex]
            if(lastItem != target){
                val neighborList = graph[lastItem]
                neighborList.forEach{ neighbor ->
                    val list = keyList.toMutableList()
                    list.add(neighbor)
                    queue.addLast(list)
                }
            }
            else{
                paths.add(keyList)
            }
        }

        return paths
    }
}