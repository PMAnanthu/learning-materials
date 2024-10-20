import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> data=new ArrayList<>();
        data.add(List.of("aa","a"));
        Solution solution=new Solution();
        for (List<String> datum : data) {
            System.out.println("Input: s = " + datum.get(0) + ", p = " + datum.get(1));
            System.out.println("Output: " + solution.isMatch(datum.get(0), datum.get(1)));
            System.out.println("-------------------------------");
        }
    }
}