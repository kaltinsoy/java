import java.util.Scanner;

public class EvenlyDivisible{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1!");
        int number1 = scan.nextInt();
        System.out.println("Enter number2!");
        int number2 = scan.nextInt();

        if (number1 == 0 || number2 == 0) {
        System.out.println("YOU ENTERED 0 !");
        } else if (number1 % number2 == 0) {
            System.out.println("TRUE!");
        } else {
            System.out.print("FALSE!");
        }
    }
}