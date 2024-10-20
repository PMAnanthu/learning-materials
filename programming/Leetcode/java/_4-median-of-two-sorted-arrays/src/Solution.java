public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int mid=length/2;
        int i=0;
        int j=0;
        int k=0;
        double [] mod=new double[2];
        while(k<=mid){
            if(i<nums1.length && j < nums2.length){
                int num1 = nums1[i];
                int num2 = nums2[j];
                if(num1<num2){
                    mod[0]=mod[1];
                    mod[1]=nums1[i];
                    i++;
                }else{
                    mod[0]=mod[1];
                    mod[1]=nums2[j];
                    j++;
                }
            }else if(i <nums1.length){
                mod[0]=mod[1];
                mod[1]=nums1[i];
                i++;
            }else{
                mod[0]=mod[1];
                mod[1]=nums2[j];
                j++;
            }
            k++;
        }
        if(length%2==0){
            return (mod[0] + mod[1]) /2;
        }else{
            return mod[1];
        }
    }
}