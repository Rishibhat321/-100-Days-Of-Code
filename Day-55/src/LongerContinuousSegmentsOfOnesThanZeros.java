public class LongerContinuousSegmentsOfOnesThanZeros {

    public static boolean checkZeroOnes(String s) {

        int max_one = 1;
        int max_zero = 1;

        int res_zero = Integer.MIN_VALUE;
        int res_one = Integer.MIN_VALUE;

        int count_ones = 0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1'){
                count_ones++;
            }
        }

        if(count_ones==s.length()){
            return true;
        }


        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0' && s.charAt(i+1)=='0'){
                max_zero++;
            }

            else if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                max_one++;
            }

            else{
                max_one = 1;
                max_zero = 1;
            }

            res_zero = Math.max(max_zero,res_zero);
            res_one = Math.max(max_one,res_one);
        }

        if(res_one>res_zero){
            return true;
        }

        return false;

    }
    public static void main(String[] args) {

        String s = "111000";

        boolean res = checkZeroOnes(s);

        System.out.println(res);

    }
}
