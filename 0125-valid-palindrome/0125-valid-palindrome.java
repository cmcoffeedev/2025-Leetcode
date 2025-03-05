class Solution {
    public boolean isPalindrome(String s) {
        char[] sArray = s.toLowerCase().toCharArray();
        int left = 0;
        int right = sArray.length - 1;
        while(left < right){
            
            if(!Character.isLetterOrDigit(sArray[left]) ){
                left++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(sArray[right]) ){
                right--;
                continue;
            }
            
            if(sArray[left] != sArray[right]) return false;
            
            left++;
            right--;
        }
        
        return true;
    }
}