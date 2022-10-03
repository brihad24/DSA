import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class Input {
    public static void main(String[] args) {
        // Scanner is a library that allows us to read input data from the terminal
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        
        System.out.println("Sum is " + sum);
    }
}
