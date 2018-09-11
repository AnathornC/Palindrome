class Solution {
    public int longestPalindrome(String s) {
        int maxSize = s.length();
        while(maxSize > 0){
            int iterations = s.length() - maxSize;
            for(int i =0; i<iterations; i++){
                if(isPalindrome(s.substring(i,i+maxSize))){
                    return maxSize;
                }
            }
            maxSize--;
        }
        return 0;
    }
    
    public boolean isPalindrome(String word){
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}