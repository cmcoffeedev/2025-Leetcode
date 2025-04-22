/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    
    const isAlphaNumeric = (char) => {
        const charCode = char.charCodeAt(0)
        return (
            (charCode <= 90 && charCode >= 65) ||
            (charCode <= 57 && charCode >= 48)
        )
    }
    
    const sLower = s.toUpperCase()
    var left = 0
    var right = sLower.length-1 
    
    while(left < right){
        const leftChar = sLower.charAt(left)
        const rightChar = sLower.charAt(right)
        
        if(!isAlphaNumeric(leftChar)){
           left++
           continue  
        } 
        if(!isAlphaNumeric(rightChar)){
           right--
           continue  
        } 
        
        if(leftChar != rightChar) return false 
        
        left++
        right--
    }
    
    return true 
};