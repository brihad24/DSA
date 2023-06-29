public class Block {
    public static void main(String[] args) {
        blockDesign(10, 8);
    }

    static void blockDesign(int n, int m){
        for(int row = 1; row<=n; row++)
        {
            for(int col=1; col<=m; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
