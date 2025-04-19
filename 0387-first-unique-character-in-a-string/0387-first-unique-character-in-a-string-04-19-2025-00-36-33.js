/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    const map = new Map()
    for(let i = 0;i < s.length;i++){
        const currentChar = s[i]
        const count = map.get(currentChar) ?? 0
        map.set(currentChar, count + 1)
    }
    for(let i = 0;i < s.length;i++){
        const currentChar = s[i]
        const count = map.get(currentChar) ?? 0
        if(count == 1) return i
    }
    return -1
};