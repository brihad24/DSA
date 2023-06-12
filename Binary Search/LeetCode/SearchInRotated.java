// Question: https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotated {
    public static void main(String[] args) {
        int [] arr ={4,5,6,7,0,1,2};
        int target = 7;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = searchPivot(nums);
        if(pivot == -1) // the array is not rotated
        {
            return bSearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target)
        {
            return pivot;
        }
        else if(target >= nums[0])
        {
            return bSearch(nums, target, 0, pivot-1);
        }
        else
        {
            return bSearch(nums, target, pivot+1, nums.length-1);
        }
    }

    static int bSearch(int[] arr, int target, int start, int end){
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

    static int searchPivot(int[] arr) {
        // we try to find the pivot, pivot = largest number in the array
        int start = 0;
        int end = arr.length - 1;
        while(start < end) 
        {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]) // check if mid is pivot
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start] > arr[mid]) // if start is greater than mid, => pivot lies to the left of mid
            {
                end = mid - 1;
            }
            else  // if start is less than mid, +. pivot lies to the right of mid
            {
                start = mid + 1;
            }
        } 
        return -1;
    }
}
