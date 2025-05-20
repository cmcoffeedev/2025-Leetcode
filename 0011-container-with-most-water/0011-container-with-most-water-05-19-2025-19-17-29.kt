class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0 
        var right = height.lastIndex 
        var max = 0
        while(left < right){
            var leftHeight = height[left]
            var rightHeight = height[right]
            val minHeight = minOf(leftHeight, rightHeight)
            val width = right - left
            val area = minHeight * width

            max = maxOf(max, area)
            if( leftHeight < rightHeight ){
                left++
            }
            else{
                right-- 
            }
        }
        return max
    }
}