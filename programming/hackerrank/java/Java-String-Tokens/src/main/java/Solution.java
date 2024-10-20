import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s==null || s.trim().equals("")) {
            System.out.println("0");
            scan.close();
            return;
        }
        String[] out = s.trim().split("[\\n\\s\\t !,?._'@]+");
        System.out.println(out.length);
        for(int i=0;i<out.length;i++){
            System.out.println(out[i]);
        }
        scan.close();
    }
}

