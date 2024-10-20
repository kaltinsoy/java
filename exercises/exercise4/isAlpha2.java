import java.util.Scanner;

public class isAlpha2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER ALPHA CHARACTER !");
        char character = scan.next().charAt(0);
        int unicode = (int) character;
        if (65 <= unicode && unicode <= 90 || 97 <= unicode && unicode <= 122)
            System.out.println("TRUE!");
    }
}