/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var max = 0
    
    for(var i = 1; i < prices.length;i++){
        var next = prices[i]
        var current = prices[i-1]
        if(current < next) max += next - current
    }
    return max
};