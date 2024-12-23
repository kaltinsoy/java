import java.util.Base64;

public class Twofish implements Cryptable {
    private static final String SECRET_KEY = "AnotherSecretKey";  // Simple key for XOR

    @Override
    public String encrypt(String data) {
        byte[] dataBytes = data.getBytes();
        byte[] encryptedData = new byte[dataBytes.length];

        // XOR encryption
        for (int i = 0; i < dataBytes.length; i++) {
            encryptedData[i] = (byte) (dataBytes[i] ^ SECRET_KEY.charAt(i % SECRET_KEY.length()));
        }

        return Base64.getEncoder().encodeToString(encryptedData);
    }

    @Override
    public String decrypt(String cryptedData) {
        byte[] encryptedData = Base64.getDecoder().decode(cryptedData);
        byte[] decryptedData = new byte[encryptedData.length];

        // XOR decryption (same as encryption)
        for (int i = 0; i < encryptedData.length; i++) {
            decryptedData[i] = (byte) (encryptedData[i] ^ SECRET_KEY.charAt(i % SECRET_KEY.length()));
        }

        return new String(decryptedData);
    }
}
