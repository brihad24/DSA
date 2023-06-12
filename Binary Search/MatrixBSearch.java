import java.util.Arrays;

public class MatrixBSearch{
    public static void main(String[] args) {
        int[][] matrix ={
                        {3, 12, 45, 87},
                        {17, 32, 56, 91},
                        {23, 39, 62, 95},
                        {29, 48, 69, 99}
                        };
        int target = 49;
        System.out.println(Arrays.toString(bSearch(matrix, target)));
    }

    // all the rows in the matrix are sorted as well as all the columns
    static int[] bSearch(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;
        int[] indices = {-1,-1};
        while(row<matrix.length && col >= 0) // we start from the last element in the first row
        {
            if(matrix[row][col] == target) // we found our answer
            {
                indices[0] = row;
                indices[1] = col;
                break;
            }
            else if(matrix[row][col] > target) // if the current value is greater, that means that every value in that col will be greater than target, hence we remove the col
            {
                col--;
            }
            else // if curr value is less than target, every value in that row will be less than target, hence we move to next row
            {
                row++;
            }
        }
        return indices;
    }
}