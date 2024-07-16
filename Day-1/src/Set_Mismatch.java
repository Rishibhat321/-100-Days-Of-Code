class Solution1 {
    public int[] findErrorNums(int[] nums) {

        int[] arr = new int[2];

        int max = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max = nums[i];
            }
        }

        int[] mis = new int[max+1];

        for(int i=0;i<nums.length;i++)
        {
            mis[nums[i]-1]++;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(mis[i]==2){
                arr[0] = i+1;
            }

            if(mis[i]==0)
            {
                arr[1] = i+1;
            }
        }

        return arr;
    }
}
public class Set_Mismatch {
    public static void main(String[] args) {

        Solution1 obj = new Solution1();

        int[] nums = {1,2,2,4};

        int[] res = obj.findErrorNums(nums);

        for(int i : res){
            System.out.print(i + " ");
        }

    }
}