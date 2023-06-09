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
