public class ReverseNum {
    static int rev(int n){
        if(n < 10)
        {
            return n;
        }
        int power10 = (int)(Math.log10(n)) + 1;
        int digit = n % 10;
        return digit * (int)Math.pow(10, power10-1) + rev(n / 10);
    }
    public static void main(String[] args) {
        int n = rev(839754623);
        // rev(n);
        System.out.println(n);
    }
}
