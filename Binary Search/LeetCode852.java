//Question: https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("index: " + ans + " Value: " + arr[ans]);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end) // since start & end are trying to point to the max element in their side, and once they point to the same element, they are pointing to greatetst element in array
        {
            mid = start + (end - start) / 2;
            if(start == end)
            {
                break;
            }
            else if(arr[mid] > arr[mid+1]) // decreasing part of array
            {
                end = mid; //since our element can be mid or previous element to mid because we don't know if the mid-1 > mid
            }
            else if (arr[mid] < arr[mid+1]) // increasing part of array
            {
                start = mid + 1; // since our element can only lie in the right side as always mid+1 > mid
            }
        } 
        return mid;
    }
}
