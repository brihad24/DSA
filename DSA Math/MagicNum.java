public class MagicNum {
    public static void main(String[] args) {
        System.out.println(calculate(6));
    }

    static int calculate(int n){
        int ans = 0;
        int base = 5;
        while(n > 0)
        {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
