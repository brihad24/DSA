// Question: https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        search(arr, target);
    }

    // we calculate the peak of the mountain array, then apply binary search separately in the ascending and descending part of the array and retrieve the lowest value
    static void search(int arr[], int target){
        int peak = peakIndexInMountainArray(arr);
        int leftIndex = bSearch(arr, target, 0, peak);
        int rightIndex = bSearch(arr, target, peak, arr.length-1);
        if(leftIndex != -1)
        {
            System.out.println(leftIndex);
        }
        else
        {
            System.out.println(rightIndex);
        }
    }

    static int bSearch(int[] arr, int target, int start, int end){
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
