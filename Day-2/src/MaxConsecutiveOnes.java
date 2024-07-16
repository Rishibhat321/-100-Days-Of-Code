public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {

        boolean result = false;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1){
                result = true;
                break;
            }
        }

        if(result==false){
            return 0;
        }

        int c=0;
        int res=0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==1 && nums[i+1]==1)
            {
                c++;
            }
            else{
                c=0;
            }
            res = Math.max(res,c);

        }

        return (res+1);
    }
    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};

        int max = findMaxConsecutiveOnes(nums);

        System.out.println(max);

    }
}