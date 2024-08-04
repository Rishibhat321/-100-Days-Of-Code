import java.util.*;

public class RangeSumOfSortedSubArraysSum {

    public static int rangeSum(int[] nums, int n, int left, int right) {

        int len = n*(n+1)/2;
        int[] arr = new int[len];

        int j=0;
        int pre_sum = 0;

        for(int i=0;i<nums.length;i++)
        {
            pre_sum = 0;
            for(int k=i;k<nums.length;k++)
            {
                pre_sum += nums[k];
                arr[j] = pre_sum;
                j++;
            }
        }

        Arrays.sort(arr);
        int sum = 0;

        int mod = 1000000007;

        for(int i=left-1;i<right;i++)
        {
            sum = (sum + arr[i]) % mod;
        }

        return sum;

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int n = nums.length;
        int left =  1;
        int right = 5;

        int res_sum = rangeSum(nums, n ,left ,right);

        System.out.println(res_sum);

    }
}