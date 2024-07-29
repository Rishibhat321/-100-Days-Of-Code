
public class CountOddNumbersInAn_IntervalRange {

    public static int countOdds(int low, int high) {

        return (high+1)/2 - low/2;

    }
    public static void main(String[] args) {

        int low = 3;
        int high = 7;

        int res = countOdds(low, high);

        System.out.println(res);

    }
}