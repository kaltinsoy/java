import java.util.Random;

public class die {
    public static void main(String args[]) {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;

        System.out.println("Dice 1: "+die1+" Dice 2: "+die2+" Sum of two dice: "+(die2+die1));


    }
}