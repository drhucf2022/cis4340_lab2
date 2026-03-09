import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * 
 * Rule 07. Exceptional Behavior (ERR)
 * 
 * ERR02-J: Prevent exceptions while logging data.
 * 
 */

public class R07_ERR02_J {

    public void securityCheck(Logger logger) {
        try {
            // ...
        } catch(SecurityException se) {
            logger.log(Level.SEVERE, "Security exception occurred", se);
            // Recover from exception
        }

    }

}