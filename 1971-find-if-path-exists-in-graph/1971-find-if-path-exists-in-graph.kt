class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {

        if(source == destination) return true

        val adjList = mutableMapOf<Int, MutableList<Int>>()
        for(row in 0 until edges.size){
            val first = edges[row][0]
            val second = edges[row][1]

            val listOne = adjList.getOrDefault(first, mutableListOf<Int>())
            val listTwo = adjList.getOrDefault(second, mutableListOf<Int>())

            listOne.add(second)
            listTwo.add(first)

            adjList[first] = listOne
            adjList[second] = listTwo
        }

        val seen = mutableSetOf<Int>() 

        val stack = ArrayDeque<Int>()
        stack.addLast(source)

        while(stack.isNotEmpty()){
            val node = stack.removeLast()
            if(node == destination) return true
            adjList[node]?.let{
                it.forEach{ destItem ->
                    if(!seen.contains(destItem)){
                        seen.add(destItem)
                        stack.addLast(destItem)
                    }
                }
            }
        }
        
        return false
    }
}