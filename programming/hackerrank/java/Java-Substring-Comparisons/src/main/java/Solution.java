import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int index=0;
        while (index<=(s.length()-k)){
            String substring=s.substring(index,index+k);

            if(smallest.equals("") || substring.compareTo(smallest)<0){
                smallest=substring;
            }
            if(substring.compareTo(largest)>0){
                largest=substring;
            }
            index++;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}