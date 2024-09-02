public class Capitalize_The_Title {

    public static String capitalizeTitle(String title) {

        int start = 0;
        int len = 0;
        char ch = ' ';

        StringBuilder s = new StringBuilder("");

        String st = "";

        for(int end=0;end<title.length();end++)
        {
            if(title.charAt(end)==' ')
            {
                len = end-start;

                if(len<=2)
                {
                    st =  title.substring(start,end).toLowerCase();
                    s.append(st);
                    s.append(' ');
                }

                else{
                    ch = Character.toUpperCase(title.charAt(start));
                    s.append(ch);

                    st =  title.substring(start+1, end).toLowerCase();
                    s.append(st);
                    s.append(' ');
                }

                start = end+1;
            }
        }

        len = title.length()-start;

        if(len<=2)
        {
            st = title.substring(start, title.length()).toLowerCase();
            s.append(st);
        }

        else{
            ch = Character.toUpperCase(title.charAt(start));
            s.append(ch);

            st = title.substring(start+1, title.length()).toLowerCase();
            s.append(st);
        }

        String str = new String(s);

        return str;

    }
    public static void main(String[] args) {

      //  String title = "capiTalIze tHe titLe";

        String title = "i lOve leetcode";

        String res = capitalizeTitle(title);

        System.out.println(res);

    }
}
