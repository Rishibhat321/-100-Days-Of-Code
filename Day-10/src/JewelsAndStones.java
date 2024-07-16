import java.util.HashSet;
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<Character>();
        int count=0;

        for(int i=0;i<jewels.length();i++)
        {
            set.add(jewels.charAt(i));
        }

        for(int i=0;i<stones.length();i++)
        {
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        String jewels = new String("aA");
        String stones = new String("aAAbbbbb");

        int res = numJewelsInStones(jewels,stones);

        System.out.println(res);

    }
}