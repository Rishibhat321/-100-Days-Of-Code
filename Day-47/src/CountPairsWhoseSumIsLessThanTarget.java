import java.util.*;

public class CountPairsWhoseSumIsLessThanTarget {

    public static int countPairs(List<Integer> nums, int target) {

        int c = 0;

        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if((nums.get(i) + nums.get(j)) < target){
                    c++;
                }
            }
        }

        return c;

    }
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        int target = 2;

        int res = countPairs(nums, target);

        System.out.println(res);

    }
}
