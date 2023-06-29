public class Diamond {
    public static void main(String[] args) {
        pyramid(5);
    }
    static void pyramid(int n){
        for(int row = 1; row<=(2*n)-1; row++)
        {
            int totalCols = row > n ? 2*n-row : row;
            for(int s = 0; s<n - totalCols; s++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col<totalCols; col++) // number of columns present in a row
                {
                    System.out.print("* ");
                }
            System.out.println(); // new line after every row has finished
        }
    }
}
