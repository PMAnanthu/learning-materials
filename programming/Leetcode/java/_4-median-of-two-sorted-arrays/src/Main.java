public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] num1={1,2};
        int[] num2={3,4};
        double value=solution.findMedianSortedArrays(num1,num2);
        System.out.println(value);
    }
}