import java.util.*;
import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();
        int ele=0;

        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                ele  = nums[i];
                break;
            }
            else{
                set.add(nums[i]);
            }
        }

        return ele;
    }
}
public class FindTheDuplicateNumber {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {3,1,3,4,2};

        int res = obj.findDuplicate(nums);

        System.out.println("The duplicate number is: " + res);

    }
}
