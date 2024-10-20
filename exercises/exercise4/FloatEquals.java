import java.util.Scanner;

public class FloatEquals {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter float1");
        float float1 = scan.nextFloat();
        System.out.println("Enter float2");
        float float2 = scan.nextFloat();

        System.out.println("Enter tolerance!");
        double tolerance = scan.nextDouble();

        if (Math.abs(float1 - float2) < tolerance)
            System.out.println("EQUAL!");
    }
}