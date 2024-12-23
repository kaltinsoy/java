public interface Cryptable {
    String encrypt(String data) throws Exception;
    String decrypt(String cryptedData) throws Exception;
}
