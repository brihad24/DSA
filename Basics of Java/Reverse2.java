import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
    /* rem to store last number
    take rem and add it to another number
    update rem with next digit
    keep iterating adn display new number*/
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int reverse  = 0;

    while(num > 0) 
    {
        int rem = num % 10;
        reverse = reverse * 10 + rem;
        num = num / 10;
    }
    System.out.println("Reverse number:" + reverse); 
    sc.close();
}
}