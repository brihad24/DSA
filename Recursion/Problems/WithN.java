public class WithN{
    public static void main(String[] args) {
        Nto1(5);
        System.out.println("--------");
        OnetoN(5);
    }

    static void Nto1(int n){
        if (n == 0)
        {
            return;
        }
        System.out.println(n);
        Nto1(n-1);
        System.out.println(n);  
    }

    static void OnetoN(int n){
        if (n == 0)
        {
            return;
        }
        OnetoN(n-1);
        System.out.println(n);
    }
}