import java.util.Map;
import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> charCount = new HashMap();
        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c) + 1);
            } else{
                charCount.put(c,1);
            }
        }
        
        boolean needsToAddOne = false;
        int maxPalindromeSize = 0;
        
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet())
        {
            if(entry.getValue() % 2 == 0){
                maxPalindromeSize += entry.getValue();
            } else{
                maxPalindromeSize += entry.getValue() -1;
                needsToAddOne = true;
            }
        }
        
        if(needsToAddOne){
            maxPalindromeSize++;
        }
        
        return maxPalindromeSize;
    }
}