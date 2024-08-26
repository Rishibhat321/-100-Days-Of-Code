import java.util.HashSet;

public class KeepMultiplyingFoundValuesByTwo {

    public static int findFinalValue(int[] nums, int original) {

        HashSet<Integer> set = new HashSet<Integer>();
        int ele = original;

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        if(!set.contains(original)){
            return original;
        }

        while(set.contains(ele)){
            ele = 2*ele;
        }

        return ele;

    }

    public static void main(String[] args) {

        int[] nums = {5,3,6,1,12};
        int original = 3;

        int res = findFinalValue(nums, original);

        System.out.println(res);

    }
}