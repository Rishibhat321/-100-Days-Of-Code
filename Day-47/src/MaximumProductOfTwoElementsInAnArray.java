
public class MaximumProductOfTwoElementsInAnArray {

    public static int maxProduct(int[] nums) {

        int max = nums[0];
        int max1 = Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max){
                max1 = max;
                max = nums[i];
            }

            else if(nums[i]>max1 && max1!=max){
                max1 = nums[i];
            }
        }

        return((max-1)*(max1-1));

    }
    public static void main(String[] args) {

        int[] nums = {3,4,5,2};

        int res = maxProduct(nums);

        System.out.println(res);

    }
}