
public class LeftAndRightSumDifferences {

    public static int[] leftRightDifference(int[] nums) {

        int len = nums.length;

        int[] left = new int[len];
        int[] right = new int[len];

        if(len==1){
            int[] arr = new int[1];
            arr[0] = 0;

            return arr;
        }

        left[0] = 0;
        left[1] = nums[0];
        int j=2;
        int sum = nums[0];
        int i=1;

        while(j<left.length && i<nums.length)
        {
            sum += nums[i];
            left[j] = sum;

            i++;
            j++;
        }

        right[len-1] = 0;
        right[len-2] = nums[len-1];

        sum = nums[len-1];
        i = len-2;
        j = len-3;

        while(j>=0 && i>=0){
            sum += nums[i];
            right[j] = sum;

            i--;
            j--;
        }

        int[] res = new int[len];

        for(int k=0;k<len;k++)
        {
            res[k] = Math.abs(left[k] - right[k]);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {10,4,8,3};

        int[] res = leftRightDifference(nums);

        // print resultant array

        for(int ele : res){
            System.out.print(ele + " ");
        }

    }
}