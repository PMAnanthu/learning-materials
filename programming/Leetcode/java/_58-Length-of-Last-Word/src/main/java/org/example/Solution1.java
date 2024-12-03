package org.example;

class Solution1 implements Solution{
    public int lengthOfLastWord(String s) {
        int right=0;
       for (int i=s.length()-1;i>=0;i--){
           if(right==0 && s.charAt(i)!=' '){
               right=i;
           }
           if(right!=0 && s.charAt(i)==' '){
               return right-i;
           }
       }
       return right+1;
    }
}