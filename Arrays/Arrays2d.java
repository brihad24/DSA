import java.util.Arrays;
import java.util.Scanner;

public class Arrays2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2d arrays are used to represent matrices
        int[][] arr1 = new int[3][3];
        for (int i =0; i < arr1.length; i++) 
        {
            for (int j =0; j < arr1[i].length; j++) // since cols can have varying lengths, we use length to find the length of array. this is dynamic arrays
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i =0; i < arr1.length; i++) 
        {
            for (int j =0; j < arr1[i].length; j++) 
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    for (int i =0; i < arr1.length; i++) 
        {
            System.out.println(Arrays.toString(arr1[i]));
        }
        
        sc.close();
    }
}
