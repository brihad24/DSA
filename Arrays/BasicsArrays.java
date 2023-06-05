import java.util.Arrays;
import java.util.Scanner;

public class BasicsArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array for primitive types
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n]; // initialize array

        // taking input
        for (int i =0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        //printing the array
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        // efficient way to print arrays
        System.out.println(Arrays.toString(arr));

        // arrays for objects
        System.out.println("Enter strings");
        String[] str = new String[n];
        for(int i=0; i<str.length; i++)
        {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        sc.close();
    }
}
