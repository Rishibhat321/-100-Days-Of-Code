
public class SumOfSquaresOfSpecialElements {

    public static int sumOfSquares(int[] nums) {

        int sum = 0;
        int n = nums.length;

        for(int i=0;i<nums.length;i++)
        {
            if(n%(i+1)==0)
            {
                sum += (nums[i]*nums[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {2,7,1,19,18,3};

        int res = sumOfSquares(nums);

        System.out.println("The sum of squares of special elements is: " + res);

    }
}