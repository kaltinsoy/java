import java.util.*;

public class numbers {
    public static void main(String args[]) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive integer! (Enter -1 to stop!)");

        int counter = 0;
        double sum = 0;
        double median = 0;

        while (true) {
            int input1 = scan.nextInt();
            if (input1 == -1) {
                break;
            } else if (input1 > 0) {
                ints.add(input1);
                sum += input1;
                counter++;
            } else {
                System.out.println("Not Positive!");
            }
        }
        //Collections.sort(ints);
        for (int i = 0; i < counter - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < counter; j++) {
                if (ints.get(j) < ints.get(minValue)) {
                    minValue = j;
                }
            }
        int t = ints.get(i);
        ints.set(i, ints.get(minValue));
        ints.set(minValue, t);

    }

    
    if (counter == 0) {
        System.out.println("No integers entered!");
        return;
    } else if (counter % 2 == 0 && counter != 0) {
        median = (ints.get(counter / 2 - 1) + ints.get(counter / 2)) / 2.0;
    } else {
        median = ints.get(counter/2);
    }
    System.out.println("Max: "+(ints.get(counter-1)));
    System.out.println("Min: "+(ints.get(0)));
    System.out.println("Median: "+median);
    System.out.println("Average: "+(sum/counter));
    System.out.println("Numbers: "+ints);
    }   
}