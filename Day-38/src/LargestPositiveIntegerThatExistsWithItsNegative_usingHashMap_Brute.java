import java.util.HashSet;
import java.util.*;

public class LargestPositiveIntegerThatExistsWithItsNegative_usingHashMap_Brute {

    public static int findMaxK(int[] nums) {

   /*     HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        int k = -1;
        int n = 0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                n = -1*nums[i];

                if(set.contains(n)){
                    k = nums[i];
                }
            }
        }

        return k;

          */

        int res = -1;
        int n = 0;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && set.contains(-1*nums[i])){

                res = Math.max(res, nums[i]);
            }
        }

        return res;

    }
    public static void main(String[] args) {

        int[] nums = {-1,10,6,7,-7,1};

        int res = findMaxK(nums);

        System.out.println(res);

    }
}