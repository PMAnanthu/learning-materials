import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        scanner.close();
        int i=1;
        int count=0;
        while (i<array.length+1){
            int j=0;
            while (j<=array.length-i){
                int sum=sum(array,j,j+i);
                if(sum<0){
                    count++;
                }
                j++;
            }
            i++;
        }
        System.out.println(count);
    }

    private static int sum(int[] array, int start, int end) {
        int sum=0;
        for(int i=start;i<end;i++){
            sum+=array[i];
        }
        return sum;
    }
}