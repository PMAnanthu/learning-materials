package org.example;

/**
 * Two pointer
 */
class Solution2 implements Solution{
    public int strStr(String haystack, String needle) {
        int left=0;
        int right=left+needle.length();
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