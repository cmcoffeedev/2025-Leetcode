class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = Integer.MAX_VALUE 
        var max = 0
        for(currentPrice in prices){
            if(currentPrice < min){
                min = currentPrice
            }
            else{
                max = maxOf(max, currentPrice - min)
            }
        }
        return max
    }
}