import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareToIgnoreCase(B)>0?"Yes":"No");
        StringBuilder Abuilder=new StringBuilder(A);
        Abuilder.setCharAt(0,String.valueOf(A.charAt(0)).toUpperCase().charAt(0));
        StringBuilder Bbuilder=new StringBuilder(B);
        Bbuilder.setCharAt(0,String.valueOf(B.charAt(0)).toUpperCase().charAt(0));
        System.out.println(Abuilder +" "+Bbuilder);
    }
}



