import java.math.BigInteger;

/**
 * 
 * Rule 04. Characters and Strings (STR)
 * 
 * STR03-J: Do not encode noncharacter data as a string.
 * 
 */

public class R04_STR03_J {

    public void convertData() {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
    }
}
