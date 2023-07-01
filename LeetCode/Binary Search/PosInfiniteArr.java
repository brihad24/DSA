// Question: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class PosInfiniteArr {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 13, 15, 17, 20, 21, 25, 27, 30, 33, 37, 41, 45, 48, 51, 55, 57, 60, 62, 65, 68, 70, 72, 75, 77, 80, 85};
        int target = 45;
        System.out.println(ans(arr, target));
    }

    // we need to search for the target in an array of infinite numbers
    // since its an infinite array, we dont know the length of array
    // we solve this by checking in chunks
    // we start by checking the chunk from arr[0] - arr[1] (size-2)
    // apply binary search in this chunk
    // if target not found, then we double the chunk and go to the next piece i.e. arr[2] - arr[5] (size-4) and apply BS again
    // next chunk would be arr[6] - arr[13] (size-8)
    // we repeat till BS finds the target
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end])
        {
            int temp = end + 1;
            end = end + ((end - start + 1) * 2);
            start = temp;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr, int target, int start, int end){
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
        } // loop keeps running until (i) it has found the target element or (ii) start > end i.e. the target does not exist in the array
        return -1;
    }
}
