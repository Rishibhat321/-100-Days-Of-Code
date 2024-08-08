public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {

        int count = 0;
        int a = 0;
        int n = 0;
        int c=0;

        for(int i=0;i<nums.length;i++)
        {
            n = nums[i];
            c=0;
            while(n>0)
            {
                a = n%10;
                n /= 10;

                c++;
            }

            if(c%2==0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        int res = findNumbers(nums);

        System.out.println("Numbers with even number of digits are: " + res);

    }
}
