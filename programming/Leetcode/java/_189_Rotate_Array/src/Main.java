public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1,2};
        int k = 3;
        solution.rotate(array, k);
        for (int i : array) {
           System.out.println(i);
        }
    }
}