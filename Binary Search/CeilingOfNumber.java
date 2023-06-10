public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 7, 12, 17, 23, 32, 41, 56, 62, 68, 75, 80, 87, 92};
        int target = 54;
        int ans = ceiling(arr, target);
        if(ans > 0)
        {
            System.out.println(arr[ans]);
        }
        else
        {
            System.out.println(ans);
        }
    }
    // returns the largest number greater than or equal to target

    //explanation: we need to return the index of the smallest number in array greater than our target
    // as our loop runs, when the algorithm fails to find the target, start > end (since this is the terminating condtion)
    // by now, the start and end have closed in on the possible index of target if it existed
    // since the target was not found, the start index will be pointing to the number greater than our target, which is lowest in the array
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]) // if target is greater than greatest element in the array
        {
            return -1;
        }
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
        return start;
    }
}
