class Solution {
    public int myAtoi(String s) {
       if(s.isBlank()){
           return 0;
       }
       int result=0, i=0, sign=1;
       while (i<s.length()){
           if(s.charAt(i)== ' '){
               i++;
           }else{
               break;
           }
       }
       if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
           if(s.charAt(i++)=='-'){
               sign=-1;
           }
       }

       while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7 )){
                if(sign==-1){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
           result=result*10+(s.charAt(i++) - '0');
       }
       return sign*result;
    }
}