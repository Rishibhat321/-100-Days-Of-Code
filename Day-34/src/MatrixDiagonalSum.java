public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j){
                    sum += mat[i][j];
                    mat[i][j] = 0;
                }
            }
        }

        int k = col-1;
        int l = 0;

        while(k>=0 && l<=row){
            sum += mat[l][k];

            k--;
            l++;
        }

        return sum;

    }
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        int res = diagonalSum(matrix);
        System.out.println(res);

    }
}
