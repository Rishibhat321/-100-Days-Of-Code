public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {

        int[] arr = new int[nums.length];

        int k=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                arr[k] = nums[i];
                k++;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0){
                arr[k] = nums[i];
                k++;
            }
        }

        return arr;

    }
    public static void main(String[] args) {

        int[] nums = {3,1,2,4};

        int[] res = sortArrayByParity(nums);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}
