public class MinimumCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {

        int i=0;
        int j=0;


        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                int ele = nums1[i];

                return ele;
            }

            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return -1;

    }
    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};

        int res = getCommon(nums1, nums2);

        System.out.println(res);

    }
}
