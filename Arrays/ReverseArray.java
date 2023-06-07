import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in the array");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        reverse(arr);
        sc.close();
    }

    static void reverse(int[] arr){
        int temp = 0;
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
