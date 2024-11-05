import java.util.*;

public class histogram {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers between 1 - 50");
        int int2 = 0;
        int int3 = 0;
        int int4 = 0;
        int int5 = 0;
        int int6 = 0;
        char ast = '*';
        
        while (true) {
        int int1 = scan.nextInt();
            if (int1 == -1) {
                break;
            } else if (int1 > 50 || int1 < 1) {
                System.out.println("Integer not between 1 - 50 !");
                continue;
            } else {
                if (int1 < 11) {
                    int2++;
                } else if (int1 < 21) {
                    int3++;
                } else if (int1 < 31) {
                    int4++;
                } else if (int1 < 41) {
                    int5++;
                } else if (int1 < 51) {
                    int6++;
                }
                
            }
        }
    System.out.println(" 1 - 10 | "+"*".repeat(int2));
    System.out.println("11 - 20 | "+"*".repeat(int3));
    System.out.println("21 - 30 | "+"*".repeat(int4));
    System.out.println("31 - 40 | "+"*".repeat(int5));
    System.out.println("41 - 50 | "+"*".repeat(int6));
    }
}