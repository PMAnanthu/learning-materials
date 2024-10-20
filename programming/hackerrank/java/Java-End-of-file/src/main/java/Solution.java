import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<String> array=new ArrayList<>();
        while(scanner.hasNext()){
            array.add(scanner.nextLine());
        }
        for(int j=0;j<array.size();j++){
            System.out.println(j+1+" "+array.get(j));
        }
        scanner.close();
    }
}