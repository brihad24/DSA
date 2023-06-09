public class OrderAgnosticBinSearch {
    public static void main(String[] args) {
        // int[] arr = {2, 7, 12, 17, 23, 32, 41, 56, 62, 68, 75, 80, 87, 92};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = bSearch(arr, target);
        System.out.println(ans);
    }
    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <=end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(arr[start] <= arr[end]) // ascending
            {
                if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            if(arr[start] >= arr[end]) // descending
            {
                if(target > arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
