import java.util.*;

/* import java.util.HashSet; */

public class FindAllNumbersDisappearedInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

 /*       int len = nums.length;

        ArrayList<Integer> list = new ArrayList<Integer>();

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<len;i++)
        {
            set.add(nums[i]);
        }

        for(int i=1;i<=len;i++)
        {
            if(!set.contains(i)){
                list.add(i);
            }
        }

        return list;  */


        int[] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]-1]++;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                list.add(i+1);
            }
        }

        return list;

    }

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> res =  findDisappearedNumbers(nums);

        System.out.println(res);


    }
}