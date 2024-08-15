
public class CountingWordsWithAGivenPrefix {

    public static int prefixCount(String[] words, String pref) {

  /*    int c = 0;
        int j=0;
        int k=0;

        for(int i=0;i<words.length;i++)
        {
            k=0;
            for(j=0;j<pref.length();j++)
            {
                if(words[i].length()<pref.length()){
                    break;
                }

                if(words[i].charAt(j)!=pref.charAt(j)){
                    break;
                }

                k++;
            }

            if(k==pref.length()){
                c++;
            }
        }

        return c;
          */


 /*         int c=0;
          int len = pref.length();

          for(int i=0;i<words.length;i++)
          {
            if(words[i].length()<pref.length()){
                continue;
            }

            else if(words[i].substring(0,len).equals(pref.substring(0,len))){
                c++;
            }
          }

          return c;  */


        int c=0;

        for(int i=0;i<words.length;i++)
        {
            if(words[i].startsWith(pref)){
                c++;
            }
        }

        return c;
    }
    public static void main(String[] args) {

        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";

        int res = prefixCount(words, pref);

        System.out.println(res);

    }
}