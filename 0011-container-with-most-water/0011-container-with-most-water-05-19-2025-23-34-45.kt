class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        var left = 0
        var right = height.lastIndex
        while(left < right){
            val leftHeight = height[left]
            val rightHeight = height[right]
            // container can only hold up to the smallest height
            val minHeight = minOf(leftHeight, rightHeight)
            val width = right - left
            val area = minHeight * width
            max = maxOf(max, area)
            if(leftHeight < rightHeight){
                left++
            }
            else{
                right--
            }
        }
        return max
    }
}