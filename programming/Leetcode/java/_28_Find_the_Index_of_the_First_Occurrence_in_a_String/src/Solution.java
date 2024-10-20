class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        int left=0;
        int right=needle.length();

        while (right<=haystack.length()){
           String substring=haystack.substring(left,right);
           if(substring.equals(needle)){
               return left;
           }
           left++;
           right=left+needle.length();
        }
        return -1;
    }
}