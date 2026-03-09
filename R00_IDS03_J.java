import java.util.logging.Logger;

/**
 * 
 * Rule 00. Input Validation and Data Sanitation (IDS)
 * 
 * IDS03-J: Do not log unsanitized user input.
 * 
 */

public class R00_IDS03_J {
    //...
    public void logUser(boolean loginSuccessful, String username, Logger logger) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
    //...
}
