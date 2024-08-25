public class CountPairsThatFormACompleteDay {
    public static int countCompleteDayPairs(int[] hours) {

        int pairs = 0;

        for(int i=0;i<hours.length;i++)
        {
            for(int j=i+1;j<hours.length;j++)
            {
                if((hours[i] + hours[j]) % 24==0){
                    pairs++;
                }
            }
        }

        return pairs;

    }
    public static void main(String[] args) {

        int[] hours = {12,12,30,24,24};

        int res = countCompleteDayPairs(hours);

        System.out.println(res);

    }
}
