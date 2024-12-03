package org.example;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length=s.length();
        for(int i=length/2;i>0;i--){
            if(length%i==0){
                int repeat=length/i;
                String substring=s.substring(0,i);
                StringBuilder builder=new StringBuilder();
                builder.append(substring.repeat(repeat));
                if(builder.toString().equals(s))return true;
            }
        }
        return false;
    }
}