import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and digit: ");
        int number = sc.nextInt();  // Number to check occurences
        int digit = sc.nextInt(); // Number of occurences of digit
        int count = 0; 

        while(number > 0)
        {
            int rem = number % 10;
            if(rem == digit)
            {
                count++;
            }
            number = number / 10;
        }
        System.out.println("Total occurences: " + count);
        sc.close();
    }
}
