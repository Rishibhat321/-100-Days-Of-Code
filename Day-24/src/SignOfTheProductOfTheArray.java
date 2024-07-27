public class SignOfTheProductOfTheArray {

    public static int arraySign(int[] nums) {

        int count_odd = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                return 0;
            }

            if(nums[i]<0){
                count_odd++;
            }
        }

        if(count_odd%2==0){
            return 1;
        }

        return -1;

    }
    public static void main(String[] args) {

        int[] nums = {-1,-2,-3,-4,3,2,1};

        int res = arraySign(nums);

        System.out.println(res);

    }
}
