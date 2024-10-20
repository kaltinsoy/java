import java.util.Scanner;

public class isAlpha{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ALPHA character!");
        char value1 = scan.next().charAt(0);
        int value2 = value1 - '0';
        if (16 < value2 && value2 < 43 || 48 < value2 && value2 < 75)
            System.out.println("TRUE!");
    }
}
// In this code '0' = 48 so unicode - 48 is the output !!