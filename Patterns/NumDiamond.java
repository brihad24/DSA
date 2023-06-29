public class NumDiamond {
    public static void main(String[] args) {
        pyramid(4);
    }
    static void pyramid(int n){
        for(int row = 1; row<=(2*n)-1; row++)
        {
            int totalCols = row > n ? 2*n-row : row;
            for(int s = 0; s<n-totalCols; s++)
            {
                System.out.print("  ");
            }
            for(int col = totalCols; col>=1; col--)
            {
                System.out.print(col + " ");
            }
            for(int col = 2; col<=totalCols; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
