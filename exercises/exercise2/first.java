import java.util.Scanner;
public class first{
    public static void main(String[] args) {
        int test1;
        int test2;
        double radius;
        System.out.println("Test Data:");
        System.out.println("a. "+(-5 + 8 * 6));
        System.out.println("b. "+ ((55+9) % 9));
        System.out.println("c. "+ (20 + -3*5 / 8));
        System.out.println("d. "+ (5 + 15 / 3 * 2 - 8 % 3));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer 1");
        test1 = scan.nextInt();
        
        System.out.println("Enter integer 2");
        test2 = scan.nextInt();

        System.out.println("The PRODUCT of two integer: "+ (test1*test2));

        System.out.println("Enter radius of a circle! (pi taken as 3!)");
        radius = scan.nextDouble();
        System.out.println("The area of circle: "+(3*radius*radius)+"\nThe perimeter of circle: "+(2*3*radius));
    }
}