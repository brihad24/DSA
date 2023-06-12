// Question: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class SortedArray1standLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr, 7)));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if (target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                ans = mid;
                if(findStartIndex)  // we run our binary search again to check the left-side array of our target element
                {                   // we keep running this until the loop terminates, i.e. the element is not found (start > end)
                    end = mid - 1; 
                }
                else  // we run our binary search again to check the right-side array of our target element
                {     // we keep running this until the loop terminates, i.e. the element is not found (start > end)
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
