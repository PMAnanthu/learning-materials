import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int breadth=scanner.nextInt();
        int height=scanner.nextInt();
        if(breadth<1 || height<1){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            System.out.println(breadth * height);
        }
        scanner.close();
    }
}