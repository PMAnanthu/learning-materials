import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution1 solution=new Solution1();
        int[] array={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(solution.removeElement(array,val));
        for(int i=0;i< array.length;i++){
           System.out.println(array[i]);
        }
    }
}