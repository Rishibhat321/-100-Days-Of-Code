
public class FindIndicesWithIndexAndValueDifferenceI {

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

        int[] arr = new int[2];
        int i=0,j=0;
        int index1 = -1;
        int index2 = -1;

        // Base case
        /* imp. */

        if(nums.length==1){
            if(indexDifference==0 && valueDifference == 0){
                arr[0] = 0;
                arr[1] = 0;

                return arr;
            }
        }

        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if((Math.abs(i-j) >= indexDifference) &&
                        (Math.abs(nums[i]-nums[j]) >= valueDifference))
                {

                    index1 = i;
                    index2 = j;

                    arr[0] = index1;
                    arr[1] = index2;

                    return arr;
                }
            }
        }

        arr[0] = index1;
        arr[1] = index2;

        return arr;

    }
    public static void main(String[] args) {

        // Base Case

        /*  int[] nums = {0};
        int valueDifference = 0;
        int indexDifference = 0;
         */


        int[] nums = {5,1,4,1};
        int valueDifference = 4;
        int indexDifference = 2;

        int[] res = findIndices(nums, indexDifference, valueDifference);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}