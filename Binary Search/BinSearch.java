public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {2, 7, 12, 17, 23, 32, 41, 56, 62, 68, 75, 80, 87, 92};
        int target = 63;
        int ans = bSearch(arr, target);
        System.out.println(ans);
    }
    // works only on sorted arrays
    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) // since if the start > end, there is no arr range to search from
        {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) // since the array is sorted, we search in the left-side of the array as target is less than mid element
            {
                end = mid - 1;
            }
            else if (target > arr[mid]) // since the array is sorted, we search in the right-side of the array as target is greater than mid element
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        } // loop keeps running until (i) it has found the target element or (ii) start > end i.e. the target does not exist in the array
        return -1;
    }
}
