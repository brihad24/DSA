public class CheckSorted{
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,8,9,12};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int i){
        if(arr[i] == arr[arr.length - 1])
        {
            return true;
        }
        // if(arr[i] > arr[i+1])
        // {
        //     return false;
        // }
        return arr[i] < arr[i+1] && isSorted(arr, i+1);
    }
}