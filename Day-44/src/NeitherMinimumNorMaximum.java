
public class NeitherMinimumNorMaximum {

    public int findNonMinOrMax(int[] nums) {

        int res = -1;
        int min = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max){
                max = nums[i];
            }

            if(nums[i]<min){
                min = nums[i];
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=min && nums[i]!=max){
                res = nums[i];
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {3,2,1,4};

        NeitherMinimumNorMaximum obj = new NeitherMinimumNorMaximum();
        int res =  obj.findNonMinOrMax(nums);

        System.out.println(res);
    }
}