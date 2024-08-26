public class LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {

        int max = nums[0];
        int index = 0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i!=index){
                if(max<(2*nums[i])){
                    return -1;
                }
                else{
                    continue;
                }
            }
        }

        return index;

    }
    public static void main(String[] args) {

        int[] nums = {3,6,1,0};

        int res = dominantIndex(nums);

        System.out.println(res);

    }
}
