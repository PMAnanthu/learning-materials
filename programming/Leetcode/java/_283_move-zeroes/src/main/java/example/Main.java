package example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution1();
        int[] numbs={0,1,0,3,12};
        solution.moveZeroes(numbs);
        for (int numb : numbs) {
            System.out.println(numb);
        }
    }
}