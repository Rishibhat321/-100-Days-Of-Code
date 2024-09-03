public class SumOfDigitsOfStringAfterConvert {

    public static int getLucky(String s, int k) {

        int sum=0;
        int a=0;
        int val = 0;

        for(int i=0;i<s.length();i++)
        {
            val = s.charAt(i) - 'a' +1;

            while(val>0)
            {
                a = val%10;
                val /= 10;

                sum += a;
            }
        }

        k--;

        int c=0;
        int new_sum = 0;

        while(c<k)
        {
            new_sum =0;
            while(sum>0)
            {
                a = sum%10;
                sum /= 10;

                new_sum += a;
            }

            sum = new_sum;

            c++;
        }

        return sum;

    }

    public static void main(String[] args) {

        String s = "leetcode";
        int k=2;

        int res = getLucky(s, k);

        System.out.println(res);

    }
}
