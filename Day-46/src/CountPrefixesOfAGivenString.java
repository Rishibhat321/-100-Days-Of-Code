
public class CountPrefixesOfAGivenString {

    public static int countPrefixes(String[] words, String s) {

 /*       int count = 0;
        int i = 0;
        int c=0;

       for(int j=0;j<words.length;j++){
          i=0;
          c=0;

          while(i<s.length() && i<words[j].length()){

            if(s.charAt(i)==words[j].charAt(i)){
                i++;
                c++;
            }
            else{
                break;
            }
          }

          if(c==words[j].length()){
            count++;
          }
       }

       return count;  */

        int count = 0;

        for(String str : words){

            if(s.startsWith(str)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";

        int res = countPrefixes(words, s);

        System.out.println(res);

    }
}