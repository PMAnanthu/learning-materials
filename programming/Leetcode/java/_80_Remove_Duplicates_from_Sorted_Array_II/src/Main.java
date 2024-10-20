public class Main {
    public static void main(String[] args) {
        Solution1 solution=new Solution1();
        int[] array={1,1,1,2,2,3};
        System.out.println(solution.removeDuplicates(array));
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}