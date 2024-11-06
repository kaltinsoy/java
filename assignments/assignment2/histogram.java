import java.util.Scanner;

public class histogram {

    private static String generateAst(int count) {
        String result ="";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers between 1 - 50");
        int int2 = 0;
        int int3 = 0;
        int int4 = 0;
        int int5 = 0;
        int int6 = 0;
        
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


    System.out.println(" 1 - 10 | "+ (int2 > 0 ? generateAst(int2) : ""));
    System.out.println("11 - 20 | "+ (int3 > 0 ? generateAst(int3) : ""));
    System.out.println("21 - 30 | "+ (int4 > 0 ? generateAst(int4) : ""));
    System.out.println("31 - 40 | "+ (int5 > 0 ? generateAst(int5) : ""));
    System.out.println("41 - 50 | "+ (int6 > 0 ? generateAst(int6) : ""));
    }
}