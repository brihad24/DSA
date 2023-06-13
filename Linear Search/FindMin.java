import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {77, 62, 93, 34, 12, 88, 23, 49, 76, 55};
        int[][] arr2d ={{23, 4, 1},
                        {18, 12, 3, 9},
                        {78, 99, 34, 56},
                        {18, 12}
                        };
        System.out.println("Min number is at: " + min(arr));
        System.out.println("Min number is at: " + min2d(arr2d));
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i< arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

    static int min2d(int[][] arr2d){
        int min = arr2d[0][0];
        for(int i = 0; i< arr2d.length; i++)
        {
            for(int j = 0; j< arr2d[i].length; j++)
            {
                if(min > arr2d[i][j])
                {
                    min = arr2d[i][j];
                }
            }
        }
        return min;
    }
}
