import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> data=new ArrayList<>();
        for(int i=0;i<n;i++){
            data.add(scanner.nextInt());
        }
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
             scanner.nextLine();
             String op=scanner.nextLine();
             if("Insert".equals(op)){
                 int index=scanner.nextInt();
                 int value=scanner.nextInt();
                 data.add(index, value);
             }else if("Delete".equals(op)){
                 int index=scanner.nextInt();
                 data.remove(index);
             }
        }
        for (Integer datum : data) {
            System.out.print(datum + " ");
        }
        scanner.close();
    }
}
