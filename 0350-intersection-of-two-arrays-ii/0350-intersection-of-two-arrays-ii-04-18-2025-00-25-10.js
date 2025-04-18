/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    const map = new Map()
    nums1.forEach((num) =>{
        const count = map.get(num) ?? 0
        map.set(num, count + 1)
    })
    
    const intersection = [] 
    nums2.forEach((num) =>{
        const count = map.get(num) ?? 0
        if(count > 0){
            intersection.push(num)
            map.set(num, count - 1)
        } 
    })
    return intersection
};