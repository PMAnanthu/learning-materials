import java.util.Arrays;
import java.util.List;

public class Test {
    /*
    * input : [3,0,1]
	output : 2
    * */

    public static void main(String[] s){
        int[] data= {3,0,1};
        System.out.println(check(data));
    }

    private static int check(int[] data) {
        int dataSum=0;
        for(int i=0;i<=data.length;i++){
            dataSum=i+dataSum;
        }
        for(int i=0;i<data.length;i++){
            dataSum=dataSum-data[i];
        }

        return dataSum;
    }
}
