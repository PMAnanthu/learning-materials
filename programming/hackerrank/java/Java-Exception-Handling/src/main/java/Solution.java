import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner scanner=new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a/b;
            System.out.print(c);
        } catch(InputMismatchException ob){
            System.out.print("java.util.InputMismatchException");
        } catch(Exception e) {
            System.out.print(e);
        }
    }
}