import java.util.Scanner;

public class leapYear {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year!");
        int year = scan.nextInt();

        if (year < 1582){
        System.out.println("ENTER MORE THAN YEAR 1581!");
        } else if (year%4 == 0 || year%100 == 0 && year%400 == 0) {
            System.out.println("The year "+year+" is a leap year!");
        } else {
            System.out.println("The year: "+year+" isn't leap year");
        }
    }
}