package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> value=new HashMap<>();
        value.put('I',1);
        value.put('V',5);
        value.put('X',10);
        value.put('L',50);
        value.put('C',100);
        value.put('D',500);
        value.put('M',1000);
        int result=0;
        for(int i=s.length()-1;i>=0;i--){
            int val=0;
            if(i>0 && value.get(s.charAt(i))>value.get(s.charAt(i-1))) {
                val= value.get(s.charAt(i))-value.get(s.charAt(i-1));
                i--;
            }else {
                val = value.get(s.charAt(i));
            }
            result = result + val;
        }
        return result;
    }
}