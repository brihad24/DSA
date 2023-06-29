public class LeftPyramid {
    public static void main(String[] args) {
        pyramid(4);
    }
    static void pyramid(int n){
        for(int row = 1; row<=n; row++)
        {
            for(int col = 1; col<=row; col++) // number of columns present in a row
            {
                System.out.print("* ");
            }
            System.out.println(); // new line after every row has finished
        }
    }
}