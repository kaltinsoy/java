import java.util.Scanner;
import java.util.Random;

public class name{
    public static void main(String args[]) {
        String name1;
        String name2;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int random1 = generator.nextInt(10,99);

        System.out.println("Enter your name!");
        name1 = scan.nextLine();
        System.out.println("Enter your surname!");
        name2 = scan.nextLine();

        String selectedName1 = name1.substring(1);
        String secretName1 = name1.replaceAll(selectedName1,"*");
        String selectedName2 = name2.substring(5);
        String secretName2 = name2.replaceAll(selectedName2,"*");
        System.out.print("First name: "+secretName1+"\tLast Name: "+secretName2+"\tAccount ID: "+random1+"\n");

        System.out.print("Phone number:");
        int randomfirst = generator.nextInt(8);
        int randomsecond = generator.nextInt(8);
        int randomthird = generator.nextInt(8);
        int random655 = generator.nextInt(556) + 100;
        int random1000 = generator.nextInt(9000) + 1000;
        System.out.println(""+randomfirst+randomsecond+randomthird+"-"+random655+"-"+random1000);

        String original = "This is an original example string";
        String change = original.replace("e", "j");
        System.out.println("Original: "+original);
        System.out.println("Change: "+change);
    }
}