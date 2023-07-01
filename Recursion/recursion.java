public class recursion{
    public static void main(String[] args) {
        rec(1);
    }

    static void rec(int n){
        if(n>5) // base condition => terminates our recursion. without this, our function keeps executing
        {
            return;
        }

        System.out.println(n);
        rec(n+1); // recursive call => calls the function to keep looping
    }
}