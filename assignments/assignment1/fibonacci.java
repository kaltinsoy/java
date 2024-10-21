import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int count = 1;
        int userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive number!");
        userInput = scan.nextInt();

            while (userInput >= b) {
            int c = a + b;
            a = b;
            b = c;
            ++count;
            }
        System.out.println("Index is : "+count);
    }
}