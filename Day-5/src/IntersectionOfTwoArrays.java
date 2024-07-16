import java.util.HashSet;
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int ele:nums1){
            set.add(ele);
        }

        for(int ele:nums2){
            if(set.contains(ele)){
                set2.add(ele);
            }
        }

        int len = set2.size();
        int[] arr = new int[len];
        int k=0;

        for(int ele:set2){
            arr[k] = ele;
            k++;
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = intersection(nums1, nums2);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}
