import java.util.HexFormat;


public class singleByteXORCipher {
    public static void main(String[] args) {
    String hexS = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736";
    byte[] byteS = HexFormat.of().parseHex(hexS);

int i = 0;
String crypted = "";
int t = 0;
byte max = 0x00;

    for(byte b = 0x00; b <= 0xFF; b++){
        String Tcrypted = "";
        for(int a = 0; a < hexS.length; a++) {
            Tcrypted = (byte) (b ^ hexS[a]);
        }

}


    }

}
