import java.util.HashSet;

public class FindCommonElementsBetweenTwoArrays {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<Integer>();
        int[] arr = new int[2];

        int index=0;
        int index1=0;

        for(int ele: nums2){
            set.add(ele);
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(set.contains(nums1[i]))
            {
                index++;
            }
        }

        arr[0] = index;

        set.clear();

        for(int ele:nums1){
            set.add(ele);
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i])){
                index1++;
            }
        }

        arr[1]= index1;

        return arr;

    }
    public static void main(String[] args) {

        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};

        int[] res = findIntersectionValues(nums1, nums2);

        for(int ele:res){
            System.out.print(ele + " ");
        }



    }
}