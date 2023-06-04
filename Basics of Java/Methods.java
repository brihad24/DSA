import java.util.Scanner;
public class Methods {
    static int m = 69;
    public static void main(String[] args) {
        printStmt();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter digits:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = add(x,y); // Variable should have the typoe of the method
        System.out.println("Sum is: " + ans);

        m = 71; // Shadowing is a technique used to overwrite a particular variable initialized outside the scope of the method
        System.out.println(m); // prints 71 since we shadowed by the new value
        sc.close();
    }

    static void printStmt() // When you don't have  a return statement, i.e. you don't have a return type, you write void
    {
        System.out.println("Hello World" + m); // Since m is declared in the class, all the methods in the class can access variable m
    }

    static int add(int a, int b) // When you need to return a particular type, in this case an int, you write that type in syntax
    {
        int sum = a + b;
        return sum;
    }
    
}
