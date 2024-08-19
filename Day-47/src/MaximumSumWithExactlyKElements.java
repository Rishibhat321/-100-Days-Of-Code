public class MaximumSumWithExactlyKElements {

    public static int maximizeSum(int[] nums, int k) {

  /*      Arrays.sort(nums);

        int max = nums[nums.length-1];
        int sum = 0;

        while(k>0){
            sum += max;
            max += 1;

            nums[nums.length-1] = max;

            k--;
        }

        return sum;  */

        int max = nums[0];
        int index = 0;
        int sum = 0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }

        while(k>0){

            sum += max;
            max += 1;
            nums[index] = max;

            k--;

        }

        return sum;

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int k = 3;

        int res = maximizeSum(nums, k);

        System.out.println(res);

    }
}
