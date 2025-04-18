/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let carry = 1
    for(let i = digits.length - 1;i >= 0;i--){
        const current = digits[i]
        const sum = carry + current
        carry = Math.floor(sum / 10)
        digits[i] = sum % 10
    }

    if(carry > 0){
       digits.unshift(carry) 
    }
    return digits
};