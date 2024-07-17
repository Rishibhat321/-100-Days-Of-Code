public class RemoveDuplicatesFromSortedArrayII_Naive {
    public static int removeDuplicates(int[] nums) {

        int n =nums.length;
        int ele = Integer.MIN_VALUE;

        int i=0;

        int k =0;

        while(i<n)
        {
            if(nums[i]==ele)
            {
                nums[i] = Integer.MIN_VALUE;
                i++;
            }

            else if((i<n-1) && (nums[i]==nums[i+1]))
            {
                ele = nums[i];
                i += 2;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<n;j++)
        {
            if(nums[j]!=Integer.MIN_VALUE)
            {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        int res = removeDuplicates(nums);

        System.out.println(res);

    }
}
