
public class SpecialArrayI {

    public boolean isArraySpecial(int[] nums) {

        for(int i=0;i<nums.length-1;i++)
        {
            if((nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0)){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {

        int[] nums = {4,3,1,6};

        SpecialArrayI obj = new SpecialArrayI();

        boolean res = obj.isArraySpecial(nums);

        System.out.println(res);

    }
}