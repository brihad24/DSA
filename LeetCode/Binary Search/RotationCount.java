//Question: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(searchPivot(nums));
    }

    static int searchPivot(int[] nums) { // same logic as trying to find pivot element, but do pivot+1 for count or minimum element
        // we try to find the pivot, pivot = largest number in the array
        int start = 0;
        int end = nums.length - 1;
        while(start < end) 
        {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1]) // check if mid is pivot
            {
                return nums[mid+1];
            }
            if(mid > start && nums[mid] < nums[mid-1])
            {
                return nums[mid];
            }
            if(nums[start] > nums[mid]) // if start is greater than mid, => pivot lies to the left of mid
            {
                end = mid - 1;
            }
            else  // if start is less than mid, +. pivot lies to the right of mid
            {
                start = mid + 1;
            }
        } 
        return nums[0];
    }
}
