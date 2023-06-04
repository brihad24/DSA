import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println((isPrime(num)));
    }

    static String isPrime(int num) 
    {
        String status = "";
        int c = 2;
        if (num <= 1)
        {
            status = "Neither prime nor composite";
        }
        if (c * c > num)
        {
            status = "Prime";
        }
        while (c*c <= num)
        {
            if (num % c == 0)
            {
                status = "Composite";
                break;
            }
            else
            {
                status = "Prime";
            }
            c++;
        }
        return status;
    }
}

