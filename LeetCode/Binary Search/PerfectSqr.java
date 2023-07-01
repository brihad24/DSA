// Question: https://leetcode.com/problems/valid-perfect-square

public class PerfectSqr {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    static boolean mySqrt(int x){
        long start = 0;
        long end = x;
        while(start <= end)
        {
            long mid = start + (end - start) / 2;
            if(mid*mid > x)
            {
                end = mid - 1;
            }
            else if (mid*mid < x)
            {
                start = mid + 1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
