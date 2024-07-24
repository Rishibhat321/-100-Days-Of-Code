import java.util.*;
import java.util.List;

public class SummaryRanges_usingStringBuilder {

    public static List<String> summaryRanges(int[] nums) {

        StringBuilder s = new StringBuilder("");
        List<String> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i < nums.length-1 && nums[i] == nums[i+1]-1){
                s.append(nums[i]).append("->");
                while(i < nums.length-1 && nums[i] == nums[i+1]-1){
                    i++;
                }
                s.append(nums[i]);
                list.add(s.toString());
                s.setLength(0);
            }else{
                list.add(nums[i]+"");
            }
        }
        return list;
    }
    public static void main(String[] args) {

        int[] nums = {0,1,2,4,5,7};

        List<String> res = summaryRanges(nums);

        System.out.println(res);

    }
}