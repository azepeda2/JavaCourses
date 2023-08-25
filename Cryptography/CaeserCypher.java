import edu.duke.*;


public class CaeserCypher {
    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            
            int index = alphabet.indexOf(currChar);
            
            if (index != -1) {
                char newChar = shiftedAlphabet.charAt(index);
                
                encrypted.setCharAt(i, newChar);
            }
            
        }
        
        return encrypted.toString();
    }
    
    public void testCaeser() {
        int key = 17;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26 - key);
        System.out.println(decrypted);
    }

}
