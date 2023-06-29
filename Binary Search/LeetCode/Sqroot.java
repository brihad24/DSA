// Question: https://leetcode.com/problems/sqrtx/

public class Sqroot {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    static int mySqrt(int x){
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
                return (int)mid;
            }
        }
        return (int)start - 1;
    }
}
