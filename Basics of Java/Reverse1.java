import java.util.Scanner;

public class Reverse1 {
public static void main(String[] args) {
    /* rem to store last number
    take rem and add it to another number
    update rem with next digit
    keep iterating adn display new number*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    String reverse  = "";

    while(num > 0)
    {
        int rem = num % 10;
        reverse = reverse + rem;
        num = num / 10;
    }
    System.out.println("Reverse is: " + reverse);
    sc.close();
}
}