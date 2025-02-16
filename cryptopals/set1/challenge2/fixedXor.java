import java.util.Scanner;
import java.util.HexFormat;

public class fixedXor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter byte string!");
        String byte1 = scan.next();
        String byte2 = scan.next();


        System.out.println(HexFormat.of().formatHex(fixedXOR(byte1, byte2)));

    }

public static byte[] fixedXOR(String byte1, String byte2) {
    byte[] byteS1 = HexFormat.of().parseHex(byte1);
    byte[] byteS2 = HexFormat.of().parseHex(byte2);

if (byteS1.length != byteS2.length) {
        throw new IllegalArgumentException("Not same!");
}

byte[] result = byteS1;
for (int t = 0; t < byteS1.length; t++) {
    result[t] = (byte) (byteS1[t] ^ byteS2[t]);

}
    return result;
}

}
