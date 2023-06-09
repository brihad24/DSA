public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {2, 7, 12, 17, 23, 32, 41, 56, 62, 68, 75, 80, 87, 92};
        int target = 63;
        int ans = bSearch(arr, target);
        System.out.println(ans);
    }
    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
