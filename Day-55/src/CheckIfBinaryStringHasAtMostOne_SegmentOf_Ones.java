public class CheckIfBinaryStringHasAtMostOne_SegmentOf_Ones {

    public static boolean checkOnesSegment(String s) {

        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String str = "1001";

        boolean res = checkOnesSegment(str);

        System.out.println(res);


    }
}
