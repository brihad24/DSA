import java.util.Arrays;

public class Search2d {
    public static void main(String[] args) {
        int[][] arr2d ={{23, 4, 1},
                        {18, 12, 3, 9},
                        {78, 99, 34, 56},
                        {18, 12}
                        };
        int target = 99;
        System.out.println("Min number is at: " + Arrays.toString(min2d(arr2d, target)));
    }
    
    static int[] min2d(int[][] arr2d, int target){
        for(int i = 0; i< arr2d.length; i++)
        {
            for(int j = 0; j< arr2d[i].length; j++)
            {
                if(target == arr2d[i][j])
                {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
