public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int len = nums.length;
        int[] arr = new int[len];
        int c=0;

        for(int i=0;i<len;i++)
        {
            c=0;
            for(int j=0;j<len;j++)
            {
                if(nums[i]>nums[j])
                {
                    c++;
                }
            }

            arr[i] = c;
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] nums = {8,1,2,2,3};

        int[] res = smallerNumbersThanCurrent(nums);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}