
public class SortArrayByParity_II {

    public int[] sortArrayByParityII(int[] nums) {

  /*      int[] arr = new int[nums.length];
        int j=0;

        for(int i=0;i<arr.length;i++){

            if(nums[i]%2==0){
                arr[j] = nums[i];
                j += 2;
            }
        }

        j=1;

        for(int i=0;i<arr.length;i++)
        {
            if(nums[i]%2!=0){
                arr[j] = nums[i];
                j += 2;
            }
        }

        return arr;  */

        int[] arr = new int[nums.length];
        int j=0;
        int k=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                arr[j] = nums[i];
                j += 2;
            }
            else{
                arr[k] = nums[i];
                k += 2;
            }
        }

        return arr;

    }

    public static void main(String[] args) {

        int[] nums = {4,2,5,7};

        SortArrayByParity_II obj = new SortArrayByParity_II();

        int[] res = obj.sortArrayByParityII(nums);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}