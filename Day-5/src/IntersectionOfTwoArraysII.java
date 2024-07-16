import java.util.*;

public class IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;

        int n = nums1.length;
        int m = nums2.length;

        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        int len = list.size();

        int[] arr = new int[len];

        for(int k=0;k<len;k++){
            arr[k] = list.get(k);
        }

        return arr;

    }
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = intersect(nums1, nums2);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}