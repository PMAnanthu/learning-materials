package org.example;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s==null ||s.isEmpty()){
            return false;
        }
        int pointer1=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(pointer1)==t.charAt(i)){
                pointer1++;
            }
        }
        return pointer1 == s.length();
    }
}