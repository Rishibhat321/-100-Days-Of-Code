
public class pow {
    public static double myPow(double x, int n) {

        double res = Math.pow(x,n);

        return res;
    }
    public static void main(String[] args) {

        double x = 2.00000;
        int n = 10;

        double val = myPow(x,n);

        System.out.println(val);

    }
}