class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[m+n];
        int m1=0;
        int n1=0;
        for(int i=0;i<result.length;i++){

            if(m1< m && n1< n){
                if (nums1[m1]<=nums2[n1]){
                    result[i]=nums1[m1];
                    m1++;
                }else {
                    result[i]=nums2[n1];
                    n1++;
                }
            }else if (m1<n){

                    result[i]=nums1[m1];
                    m1++;

            }else if(n1<n){
                result[i]=nums2[n1];
                n1++;
            }

        }
        for(int z=0;z<m+n;z++){
            nums1[z]=result[z];
        }
    }
}