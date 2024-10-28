import java.util.Scanner;

public class number {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your phone number in 10 DIGIT!");
        String phone = scan.next();
        System.out.println("Full : ("+phone.substring(0,3)+") "+
        phone.substring(3,6)+"-"+phone.substring(6,10));
        System.out.println("Local : "+phone.substring(3,6)+"-"+
        phone.substring(6,10));
        System.out.println("Campus : "+phone.substring(5,6)+"-"+
        phone.substring(6,10));
    }
}