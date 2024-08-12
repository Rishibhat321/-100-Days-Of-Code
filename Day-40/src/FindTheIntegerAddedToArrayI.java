import java.util.*;

public class FindTheIntegerAddedToArrayI {

    public static int addedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int ele = 0;

        for(int i=0;i<nums2.length;i++)
        {
            ele = nums2[i] - nums1[i];
        }

        return ele;
    }
    public static void main(String[] args) {

        int[] nums1 = {2, 6, 4};
        int[] nums2 = {9, 7, 5};

        int res = addedInteger(nums1, nums2);

        System.out.println(res);


    }
}