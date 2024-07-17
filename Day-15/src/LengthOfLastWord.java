
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        if(s.equals(""))
        {
            return 0;
        }

        int len = 1;
        int res=1;

        int n = s.length();


        for(int i=n-1;i>0;i--)
        {
            if(s.charAt(i)!=' ' && s.charAt(i-1)==' ')
            {
                return res;
            }

            else if(s.charAt(i)!=' ' && s.charAt(i-1)!=' ')
            {
                len++;
                res = Math.max(res,len);
            }

            else{
                len=1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

         // Corner Cases

       // String s = "a World";
      //  String s = "World a";

        String s = new String("   fly me   to   the moon  ");

        int result =  lengthOfLastWord(s);

        System.out.println(result);

    }
}