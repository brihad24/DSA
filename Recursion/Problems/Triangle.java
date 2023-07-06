public class Triangle {
    public static void main(String[] args) {
        invertedTriangle(4, 1);
        System.out.println();
        triangle(4, 1, 1);
    }

    static void invertedTriangle(int row, int col){
        if(row == 0)
        {
            return;
        } // base condition
        
        System.out.print("* ");
        if(col < row)
        {
            invertedTriangle(row, col+1);
        } // prints stars till row is filled with stars
        if(col >= row)
        {
            System.out.println();
            invertedTriangle(row-1, 1);
        } // once the row has reached the limit, goes to next line, resets col and decreases row by 1
    }

    static void triangle(int n, int row, int col){
        if(row == n+1)
        {
            return;
        }

        if(col <= row)
        {
            System.out.print("* ");
            triangle(n, row, col+1);
        }
        else
        {
            System.out.println();
            triangle(n, row+1, 1);
        }
    }
}
