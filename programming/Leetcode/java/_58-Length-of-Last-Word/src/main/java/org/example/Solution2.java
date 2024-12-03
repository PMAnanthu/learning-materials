package org.example;

class Solution2 implements Solution{
    public int lengthOfLastWord(String s) {
       String[] value= s.split("\\s");
       return value[value.length-1].length();
    }
}