import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args)  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String numString1 = bufferedReader.readLine();
            String numString2 = bufferedReader.readLine();

            BigInteger num1 = new BigInteger(numString1);
            BigInteger num2 = new BigInteger(numString2);

            System.out.println(num1.add(num2));
            System.out.println(num2.multiply(num2));
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}