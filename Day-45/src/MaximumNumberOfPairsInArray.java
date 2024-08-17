import java.util.*;

public class MaximumNumberOfPairsInArray {

    public static int[] numberOfPairs(int[] nums) {

    /*    int pair = 0;
        int left = 0;

        int[] arr = new int[2];

        if(nums.length==1){
            arr[0] = 0;
            arr[1] = 1;

            return arr;
        }


        Arrays.sort(nums);
        int i=0;

        while(i<nums.length)
        {
            if(i<nums.length-1 && (nums[i]==nums[i+1])){
                pair++;
                i += 2;
            }

            else{
                left++;
                i++;
            }
        }

        arr[0] = pair;
        arr[1] = left;

        return arr;  */

        int pair = 0;

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i])){
                pair++;

                Integer temp = new Integer(nums[i]);
                list.remove(temp);
            }
            else{
                list.add(nums[i]);
            }
        }

        return new int[] {pair, list.size()};

    }
    public static void main(String[] args) {

        int[] nums = {1,3,2,1,3,2,2};

        int[] res = numberOfPairs(nums);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}