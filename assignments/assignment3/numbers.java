import java.util.Scanner;
import java.util.ArrayList;

public class numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Please enter How many integer in list ?");
        count = scan.nextInt();
        int temp1 = count;

        while (temp1 > 0) {
            System.out.println("Enter integers !");
            int i = scan.nextInt();
            numbers.add(i);
            temp1--;
        }
        System.out.println(numbers);
        temp1 = count-1;
        int j = 0;
        while(0 < temp1/2) {
            int temp = numbers.get(j);
            numbers.set(j, numbers.get(temp1));
            numbers.set(temp1, temp);
            j++;
            temp1--;
        }
    
        System.out.println(numbers);
    }
}