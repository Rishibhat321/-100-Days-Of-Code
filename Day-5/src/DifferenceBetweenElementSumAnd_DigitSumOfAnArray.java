public class DifferenceBetweenElementSumAnd_DigitSumOfAnArray {
    public static int differenceOfSum(int[] nums){

        int element_sum = 0;
        int digit_sum = 0;
        int n=0;
        int a=0;
        int diff=0;

        for(int i=0;i<nums.length;i++){
            element_sum += nums[i];
        }

        for(int i=0;i<nums.length;i++){
            n = nums[i];
            while(n>0){
                a = n%10;
                n /= 10;
                digit_sum += a;
            }
        }
        diff = Math.abs(element_sum-digit_sum);

        return diff;

    }
    public static void main(String[] args) {

        int[] nums = {1,15,6,3};

        int res = differenceOfSum(nums);

        System.out.println(res);

    }
}
