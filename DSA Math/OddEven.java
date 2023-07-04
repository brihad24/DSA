public class OddEven{
    public static void main(String[] args) {
        int n = 67;
        System.out.println(check(n));
    }

    static String check(int n){
        if((n & 1) == 1)
        {
            return "odd";
        }
        return "even";
    }
}