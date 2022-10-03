import java.util.Scanner;

// print a Fibbonaci series upto user's input
public class Fibbonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number till which you want to get the fibonacci series");
        int num = input.nextInt();
        int currNo = 0;
        int nextNo = 1;

        System.out.println("The Fibonacci series is:");

        for(int i = 0; i < num; i++)
        {
            System.out.println(currNo);
            int sum = currNo + nextNo;
            currNo = nextNo;
            nextNo = sum;
        }
    }
}
