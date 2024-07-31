
public class RowWithMax1s {

    public static int[] rowAndMaximumOnes(int[][] mat) {

        int res = 0;
        int count = 0;
        int c = 0;

        int row = mat.length;
        int col = mat[0].length;

        int[] arr = new int[2];

        for(int i=0;i<row;i++)
        {
            count = 0;
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==1){
                    count++;
                }
            }

            if(c<count){
                c = count;
                res = i;
            }
        }

        arr[0] = res;
        arr[1] = c;

        return arr;


    }
    public static void main(String[] args) {

        int[][] matrix = {{0,0,0},{0,1,1}};

        int[] res = rowAndMaximumOnes(matrix);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}