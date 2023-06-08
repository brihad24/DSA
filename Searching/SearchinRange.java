import java.util.Scanner;

public class SearchinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sizze of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        System.out.println("Enter range to search in");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int ans = linear(arr, target, start, end);
        System.out.println("Index of target is: " + ans);
        sc.close();
    }

    static int linear(int[] arr, int target, int start, int end){
        if(arr.length == 0)
        {
            return -1;
        }
        for(int i=start; i<+end; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
