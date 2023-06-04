import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
        sc.close();
    }

    static String isArmstrong(int num) {
        int sum = 0;
        int n = num;
        while(n > 0)
        {
            int rem  = n % 10;
            sum += (rem * rem * rem);
            n /= 10;
        }
        if(sum == num)
        {
            return "is armstrong";
        }
        else
        {
            return "is not armstrong";
        }
}
}