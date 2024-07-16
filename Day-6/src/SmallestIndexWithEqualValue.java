public class SmallestIndexWithEqualValue {
    public static int smallestEqual(int[] nums) {

        int e = -1;
        int num = 0;

        for(int i=0;i<nums.length;i++)
        {
            num = nums[i];

            if(i % 10 == num){
                e = i;
                break;
            }
        }

        return e;
    }
    public static void main(String[] args) {

        int[] nums = {4,3,2,1};

        int res = smallestEqual(nums);

        System.out.println(res);

    }
}
