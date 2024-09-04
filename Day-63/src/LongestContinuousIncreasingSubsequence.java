
public class LongestContinuousIncreasingSubsequence {

    public static int findLengthOfLCIS(int[] nums) {

        if(nums.length==1)
        {
            return 1;
        }

        int max = 1;
        int res = 1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                max++;
            }
            else{
                max = 1;
            }

            res = Math.max(res,max);
        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums = {1,3,5,4,7};

        int ans = findLengthOfLCIS(nums);

        System.out.println(ans);

    }
}