public class Fibonacci{
    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }

    static int fibo(int n){
        if(n<2) // base condition
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2); // reccurence formula
    }
}