import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] array={9};
        int[] result=solution.plusOne(array);
        for(int val:result){
            System.out.println(val);
        }
    }
}