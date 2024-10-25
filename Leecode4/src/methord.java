public class methord {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int print1=m-1,print2=n-1;
        int tail=m+n-1;
        System.out.println(tail);
        int cur;
        while (tail>0){
            if (print1<0){
                nums1[tail]=nums2[print2];
                print2--;
            }else if (print2<0){
                nums1[tail]=nums1[print1];
                print1--;
            }else if(nums1[print1]==nums2[print2]){
                nums1[tail]=nums1[print1];
                tail--;
                print1--;
                nums1[tail]=nums2[print2];
                print2--;
            } else if (nums1[print1]>nums2[print2]) {
                nums1[tail]=nums1[print1];
                print1--;
            }else if (nums1[print1]<nums1[print2]){
                nums1[tail]=nums2[print2];
                print2--;
            }
            tail--;
        }
    }
}
