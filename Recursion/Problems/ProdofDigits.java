public class ProdofDigits {
    public static void main(String[] args) {
        System.out.println(prod(1034));
    }

    static int prod(int n){
        if(n < 10)
        {
            return n;
        }
        int digit = n % 10;
        n /=  10;
        return digit * prod(n);
    }
}
