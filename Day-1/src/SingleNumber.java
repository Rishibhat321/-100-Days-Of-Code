
import java.util.*;
import java.util.HashMap;

class Sol {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ele=0;

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        for(Map.Entry<Integer, Integer>  e : map.entrySet())
        {
            Integer key = e.getKey();
            Integer val = e.getValue();

            if(val==1){
                ele = key;
            }
        }

        return ele;

    }
}
public class SingleNumber {
    public static void main(String[] args) {

        Sol obj = new Sol();

        int[] nums = {4,1,2,1,2};

        int res = obj.singleNumber(nums);

        System.out.println("The number that appears only once is: " + res);
    }
}