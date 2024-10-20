public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0;
        int j=0;
        StringBuilder result= new StringBuilder();
        int max=0;
        while (j<s.length() && i<s.length()){
            char character=s.charAt(i);
            if(result.toString().contains(String.valueOf(character))){
                result = new StringBuilder();
                i=j;
                j++;
            }else{
                result.append(character);
                if(max<result.length()){
                    max=result.length();
                }
            }
            i++;
        }
        return max;
    }
}