public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        int len = strs.length;

        int count = 0;
        int min_length = Integer.MAX_VALUE;
        String s = "";

        StringBuilder res = new StringBuilder("");

        // Finding the minimum length string

        for(int i=0;i<len;i++)
        {
            String st = strs[i];

            if(st.length()<min_length)
            {
                min_length = st.length();
                s = strs[i];
            }
        }

        for(int i=0;i<s.length();i++)
        {
            count = 0;
            for(int j=0;j<strs.length;j++)
            {
                String str = strs[j];

                if(s.charAt(i)==str.charAt(i))
                {
                    count++;
                }
            }

            if(count==len)
            {
                res.append(s.charAt(i));
            }
            else{
                break;
            }
        }

        String result = res.toString();

        return result;

    }
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        String r = longestCommonPrefix(strs);

        System.out.println(r);

    }
}
