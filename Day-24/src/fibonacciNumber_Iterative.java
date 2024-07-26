public class fibonacciNumber_Iterative {

    public static int fib(int n) {

   /*     if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return fib(n-1) + fib(n-2);  */

        int a = 0;
        int b=1;
        int c=0;

        for(int i=2;i<=n;i++)
        {
            c = a+b;
            a=b;
            b=c;
        }

        return c;

    }

    public static void main(String[] args) {

        int n=6;

        int res = fib(n);

        System.out.println("The nth fibonacci number is: " + res);

    }
}
