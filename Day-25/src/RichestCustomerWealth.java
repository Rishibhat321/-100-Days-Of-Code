
public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int res = Integer.MIN_VALUE;
        int sum = 0;

        int row = accounts.length;
        int col = accounts[0].length;

        for(int i=0;i<row;i++)
        {
            sum=0;
            for(int j=0;j<col;j++)
            {
                sum += accounts[i][j];
            }

            res = Math.max(res,sum);
        }

        return res;

    }
    public static void main(String[] args) {

        int[][] accounts = {{1,5},{7,3},{3,5}};

        int r = maximumWealth(accounts);

        System.out.println("The richest wealth amount is: " + r);

    }
}