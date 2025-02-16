import java.util.Base64;
import java.util.HexFormat;
import java.util.Scanner;

public class hexToBase64 {
    public static void main(String[] args) {
        HexFormat hex = HexFormat.of();
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter hex!");
        String hexString = scan.next();
        byte[] byteString = HexFormat.of().parseHex(hexString);
        String convertedHex = Base64.getEncoder().encodeToString(byteString);
        scan.close();



        System.out.println(convertedHex);
    }

}
