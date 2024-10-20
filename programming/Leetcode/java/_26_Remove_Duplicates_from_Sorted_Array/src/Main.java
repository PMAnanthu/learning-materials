public class Main {
    public static void main(String[] args) {
        Solution1 solution=new Solution1();
        int[] array={1,1,2,1};
        System.out.println(solution.removeDuplicates(array));
        for (int j : array) {
            System.out.println(j);
        }
    }
}