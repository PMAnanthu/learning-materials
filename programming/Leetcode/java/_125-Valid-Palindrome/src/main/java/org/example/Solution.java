package org.example;

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        s=s.toLowerCase();
        while(left<right){
            char lChar = s.charAt(left);
            char rChar=s.charAt(right);
            if(lChar==rChar){
                left++;
                right--;
            }else{
                if(!Character.isLetterOrDigit(lChar)){
                    left++;
                } else if(!Character.isLetterOrDigit(rChar)){
                    right--;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}