public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1111));
    }

    static int sum(int n){
        if(n < 10)
        {
            return n;
        }
        int digit = n % 10;
        n /=  10;
        return digit + sum(n);
    }
}
