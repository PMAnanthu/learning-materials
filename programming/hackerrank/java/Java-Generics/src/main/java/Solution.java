import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        Solution.printArray(intArray);
        Solution.printArray(stringArray);

    }
    
    public static <T> void printArray(T[] data){
        for(T d:data){
            System.out.println(d);
        }
    }
}
