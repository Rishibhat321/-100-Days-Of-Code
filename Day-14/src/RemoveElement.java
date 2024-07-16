public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int k=0;
        int res=0;

        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]!=val)
            {
                k++;
            }

            if(nums[i]==val)
            {
                nums[i] = Integer.MIN_VALUE;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=Integer.MIN_VALUE)
            {
                int temp = nums[i];
                nums[i] = nums[res];
                nums[res] = temp;

                res++;
            }
        }

        return k;
    }
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int res = removeElement(nums,val);

        System.out.println(res);

    }
}
