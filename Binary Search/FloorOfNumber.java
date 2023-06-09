public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 7, 12, 17, 23, 32, 41, 56, 62, 68, 75, 80, 87, 92};
        int target = 63;
        int ans = floor(arr, target);
        if(ans > 0)
        {
            System.out.println(arr[ans]);
        }
        else
        {
            System.out.println(ans);
        }
    }
    // returns the smallest number less than or equal to target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]) // if target is lesser than lowest element in the array
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
        return end;
    }
}
