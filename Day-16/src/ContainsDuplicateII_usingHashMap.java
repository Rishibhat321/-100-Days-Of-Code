import java.util.HashMap;
public class ContainsDuplicateII_usingHashMap {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int abs = 0;
        int max = 0;
        int val = 0;
        int i=0;

        for(i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }

            else{
                val = map.get(nums[i]);
                abs = Math.abs(val-i);

                if(abs<=k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }

            }

        }

        return false;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,1,2,3};
        int k= 2;

        boolean res = containsNearbyDuplicate(nums, k);

        System.out.println(res);

    }
}
