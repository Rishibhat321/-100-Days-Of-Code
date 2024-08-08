public class MinimumOperationsToExceedThresholdValueI {

    public static int minOperations(int[] nums, int k) {

        int min = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<k){
                min++;
            }
        }

        return min;

    }
    public static void main(String[] args) {

        int[] nums = {2,11,10,1,3};
        int k = 10;

        int res = minOperations(nums, k);

        System.out.println("Minimum Operations needed are: " + res);

    }
}
