import java.util.Arrays;

public class Solution2 {
    public int[] twoSum(int[] numbs, int target) {
        sort(numbs);
        int left=0;
        int right=numbs.length-1;
        while (left<right){
            if(numbs[left]+numbs[right]==target){
                int[] result =new int[2];
                result[0]=numbs[left];
                result[1]=numbs[right];
                return result;
            }else if (numbs[left]+numbs[right]<target){
                left++;
            }else {
                right--;
            }
        }
        return new int[0];
    }

    private void sort(int[] numbs) {
        sort(numbs, 0, numbs.length - 1);
    }

    private void sort(int[] numbs, int l, int r) {
        if (l < r) {
            int j = pivot(numbs, l, r);
            sort(numbs, l, j);
            sort(numbs, j + 1, r);
        }
    }

    private int pivot(int[] numbs, int l, int r) {
        int pivot = numbs[l];
        int i = l;
        int j = r;
        while (i < j) {
            do {
                i++;
            } while (numbs[i] <= pivot);
            do {
                j--;
            } while (numbs[j] > pivot);
            if (i < j) {
                int temp = numbs[i];
                numbs[i] = numbs[j];
                numbs[j] = temp;
            }
        }
        int temp = numbs[l];
        numbs[l] = numbs[j];
        numbs[j] = temp;
        return j;
    }
}
