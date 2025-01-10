import java.util.*;

public class BandSale {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter band name 1 !");
    String band1N = scan.next();
    BandBooster band1, band2;
    band1 = new BandBooster(band1N);
    
    System.out.println("Enter band name 2 !");
    String band2N = scan.next();
    band2 = new BandBooster(band2N);

    System.out.println("Enter "+band1.getName()+" box number!");
    int box1 = scan.nextInt();
    band1.updateSales(box1);

    System.out.println("Enter "+band2.getName()+" box number!");
    int box2 = scan.nextInt();
    band2.updateSales(box2);

    System.out.println(band1.toString());
    System.out.println(band2.toString());
    }
} 