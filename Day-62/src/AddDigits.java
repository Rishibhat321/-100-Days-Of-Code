
public class AddDigits {

    public static int addDigits(int num) {

        if(num>=0 && num<=9)
        {
            return num;
        }


        int sum = 0;
        int c=0;

        while(c!=1){

            sum=0;
            c=0;
            while(num>0)
            {
                sum += num%10;
                num /= 10;
                c++;
            }

            num = sum;
        }

        return num;

    }

    public static void main(String[] args) {

        int num = 38;

        int res = addDigits(num);

        System.out.println(res);


    }
}