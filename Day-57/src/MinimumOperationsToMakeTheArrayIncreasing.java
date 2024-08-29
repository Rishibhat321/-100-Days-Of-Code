public class MinimumOperationsToMakeTheArrayIncreasing {

    public static int minOperations(int[] nums) {

  /*      int c = 0;

        for(int i=1;i<nums.length;i++)
        {
            while(nums[i]<=nums[i-1]){
                nums[i] += 1;
                c++;
            }
        }

        return c;   */

        int c = 0;
        int diff = 0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1]){
                diff = nums[i-1] - nums[i];
                nums[i] += diff+1;
                c += diff+1;
            }
        }

        return c;
    }
    public static void main(String[] args) {

        int[] nums = {1,5,2,4,1};

        int res = minOperations(nums);

        System.out.println(res);

    }
}
