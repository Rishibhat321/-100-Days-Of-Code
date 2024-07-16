public class CountIntegersWithEvenDigitSum {
    public static int countEven(int num) {

        int count=0;
        int sum_even=0;
        int a=0;
        int n=0;

        for(int i=1;i<=num;i++)
        {
            n=i;
            sum_even=0;
            while(n>0){
                a = n%10;
                n /= 10;
                sum_even += a;
            }

            if(sum_even%2==0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        int num = 30;

        int res = countEven(num);

        System.out.println(res);

    }
}