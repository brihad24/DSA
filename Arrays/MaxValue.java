import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in array");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int maxVal = max(arr);
        System.out.println("Max value in array is: "+ maxVal);
        sc.close();
    }

    static int max(int[] arr){
        int maxVal = 0;
        if(arr.length == 0)
        {
            maxVal = -1;
        }
        else
        {
            for(int i = 0; i<arr.length; i++)
            {
                if(arr[i] > maxVal)
                {
                    maxVal = arr[i];
                }
            }
        }
            return maxVal;
    }
}
