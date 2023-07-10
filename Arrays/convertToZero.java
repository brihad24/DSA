import java.util.Arrays;

public class zer {
    public int z = 0;
    public static void main(String[] args) {
        int[][] arr = { {1,1,1},
                        {1,0,1},
                        {1,1,1}};
        convertZero(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void convertZero(int[][] arr){
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == 0)
                {
                    for(int a = 0; a < arr.length; a++)
                    {
                        arr[a][j] = 0;
                    }
                    for(int a = 0; a < arr.length; a++)
                    {
                        arr[i][a] = 0;
                        a++;
                    }
                    return;
                }
            }
        }
    }
}

