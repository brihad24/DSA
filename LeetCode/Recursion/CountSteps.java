// Question: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class CountSteps{
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num){
        return count(num, 0);
    }

    static int count(int n, int c){
        if(n == 0)
        {
            return c;
        }
        if(n % 2 == 0)
        {
            c++;
            return count(n/2, c);
        }
        c++;
        return count(n-1, c);
    }
}