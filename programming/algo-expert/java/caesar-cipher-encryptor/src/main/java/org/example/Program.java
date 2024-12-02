package org.example;

import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
   /* StringBuilder output=new StringBuilder();
    key=key%26;
    for(int i=0;i<str.length();i++){
      int charredAt = str.charAt(i)+key;
      if(charredAt>(int)'z'){
        charredAt=charredAt-(int)'z';
        charredAt=charredAt+(((int)'a')-1);
      }
      char charAt=(char) (charredAt);
      output.append(charAt);
    }
    return output.toString();*/
    /*String result="";
    key=key%26;
    char[] t= {'a','b','c','d','e','f','g','h','i','j'
            ,'k','l','m','n','o','p','q','r','s','t','u'
            ,'v','w','x','y','z'};
    for(int i=0;i<str.length();i++){
      int chr=(str.charAt(i)+key)-'a';
      result=result+t[chr%26];
    }
    return result;*/

    String input="=========AAAA   AAABBBB   BBB";
    String result="";
    Character in=input.charAt(0);
    int count=0;
    for(int i=0;i<input.length();i++){
      if(count==9){
        result=result+9+input.charAt(i-1);
        count=0;
      }
      if(in==input.charAt(i)){
        count ++;
      }else {
        // if(count>0){
        result=result+count+in;
        in=input.charAt(i);
        count=1;
        //  }
      }

    }
    if(count>0){
      result=result+count+in;
    }
    return result;
    }
/*
    public static void main(String[] args){
      String out="";
      String value="AAAAAAAAAAAAABBCCCCDD";
      value=value.toLowerCase();
      char previous=value.charAt (0);
      int count=0;
      for (int i=0;i<value.length() ;i++){
        if(count==9) {
          out=out+count+previous;
          count=0;
        }else{
          if(previous==value.charAt(i)){
            count++;
          }else{
            count++;
            out =out+count+previous;
            previous=value.charAt(i);
            count=0;
          }
        }
      }
      if (count>0) {
        count++;
        out = out + count + previous;
      }
      System.out.println(out);
    }*/

}
