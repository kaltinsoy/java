import java.util.Scanner;
public class helloworld {
    public static void main(String[] args) {
        String test;
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A TEXT!");
        test = scan.nextLine();
        System.out.println("You entered\n" + test);
        int result = 50;
        System.out.println("Hello, World!");
    }
}
