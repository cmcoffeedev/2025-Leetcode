/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    
    var k = 0
    
    for(i = 1;i < nums.length;i++){
        var num = nums[i]
        var prev = nums[k]
        if(num != prev){
            k = k + 1
            nums[k] = num
        }
    }
    
    return k + 1
};