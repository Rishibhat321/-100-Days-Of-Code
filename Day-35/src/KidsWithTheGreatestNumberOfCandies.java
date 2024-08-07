import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {

    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<Boolean>();

        int max = candies[0];
        int sum = 0;

        for(int i=1;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max = candies[i];
            }
        }

        for(int i=0;i<candies.length;i++)
        {
            sum = candies[i] + extraCandies;

            if(sum>=max)
            {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        ArrayList<Boolean> res = kidsWithCandies(candies, extraCandies);

        System.out.println(res);

    }
}