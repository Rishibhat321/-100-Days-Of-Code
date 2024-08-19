public class FindTheSumOfEncryptedIntegers {

    public static int encrypt(int res, int c){

        int r = 0;

        while(c>0){
            r = r*10 + res;
            c--;
        }

        return r;
    }

    public static int sumOfEncryptedInt(int[] nums) {

        int num = 0;
        int a = 0;
        int c = 0;
        int res = Integer.MIN_VALUE;
        int max = 0;
        int sum = 0;

        for(int i=0;i<nums.length;i++)
        {
            num = nums[i];
            c =0;
            res = Integer.MIN_VALUE;

            while(num>0){
                a = num%10;
                num /= 10;

                res = Math.max(a,res);
                c++;
            }

            max =  encrypt(res,c);

            sum += max;
        }

        return sum;

    }
    public static void main(String[] args) {

        int[] nums = {10,21,31};

        int res = sumOfEncryptedInt(nums);

        System.out.println(res);

    }
}
