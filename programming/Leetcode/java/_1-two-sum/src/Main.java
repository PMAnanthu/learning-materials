public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] numbs={2,7,11,15};
        int target=9;
        int[] array= solution.twoSum(numbs,target);
        System.out.println(array[0]+","+array[1]);
    }
}