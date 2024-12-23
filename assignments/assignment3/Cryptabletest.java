public class Cryptabletest {
    public static void main(String[] args) {
        try {
            // Blowfish Example
            Cryptable blowfish = new Blowfish();
            String blowfishEncrypted = blowfish.encrypt("Hello, Blowfish!");
            System.out.println("Blowfish Encrypted: " + blowfishEncrypted);
            String blowfishDecrypted = blowfish.decrypt(blowfishEncrypted);
            System.out.println("Blowfish Decrypted: " + blowfishDecrypted);

            // Twofish Example
            Cryptable twofish = new Twofish();
            String twofishEncrypted = twofish.encrypt("Hello, Twofish!");
            System.out.println("Twofish Encrypted: " + twofishEncrypted);
            String twofishDecrypted = twofish.decrypt(twofishEncrypted);
            System.out.println("Twofish Decrypted: " + twofishDecrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
