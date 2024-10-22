import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scanner=new Scanner(System.in);
        List<List<String>> arr = new ArrayList<>();
        int n=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<n;i++){
            String line=scanner.nextLine();
            arr.add(Arrays.asList(line.split("\\s")));
        }
        int m=scanner.nextInt();
        for(int i=0;i<m;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            try {
                System.out.println(arr.get(x-1).get(y));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }

        scanner.close();

    }
}