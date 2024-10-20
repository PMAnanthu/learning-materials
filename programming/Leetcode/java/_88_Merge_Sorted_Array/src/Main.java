public class Main {
    public static void main(String[] args) {
        Solution1 solution=new Solution1();
        int [] array1={1,2,3,0,0,0};
        int [] array2={2,5,6};
        solution.merge(array1,3,array2,3);
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}