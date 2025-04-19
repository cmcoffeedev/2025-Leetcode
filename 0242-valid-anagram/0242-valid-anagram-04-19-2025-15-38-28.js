/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length != t.length) return false
    
    const map = new Map()
    
    for(let i = 0;i < s.length;i++){
        const char = s[i]
        const count = map.get(char) ?? 0
        map.set(char, count + 1)
    }
    
    for(let i = 0;i < t.length;i++){
        const char = t[i]
        const count = map.get(char) ?? 0
        if(count < 1) return false
        map.set(char, count - 1)
    }
    
    
    
    return true
};