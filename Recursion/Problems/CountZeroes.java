public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(ans(302040));
    }

    static int ans(int n){
        return count(n, 0);
    }

    static int count(int n, int c){
        if(n == 0)
        {
            return c;
        }
        if(n % 10 == 0)
        {
            c++;
        }
        return count(n/10, c);
    }
}
