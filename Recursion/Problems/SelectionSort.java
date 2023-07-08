import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col, int max){
        if(row == 0)
        {
            return;
        }

        if(col < row)
        {
            if(arr[col] > arr[max])
            {
                sort(arr, row, col+1, col);
            }
            else
            {
                sort(arr, row, col+1, max);
            }
        }
        else
        {
            swap(arr, max, row-1);
            sort(arr, row-1, 0, 0);
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
