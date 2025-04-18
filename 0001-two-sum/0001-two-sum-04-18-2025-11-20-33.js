/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let indices = []
    const map = new Map()
    for(let index = 0;index < nums.length;index++){
        const num = nums[index]
        const complement = target - num
        if(map.has(complement)){
            return [map.get(complement), index]
        }
        map.set(num, index)
    }
    return [-1, -1]
};