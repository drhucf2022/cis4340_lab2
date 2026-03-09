/**
 * 
 * Rule 06. Methods (MET)
 * 
 * MET01-J: Never use assertions to validate method arguments.
 * 
 */

public class R06_MET01_J {

    public static int getAbsAdd(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }

    int answer = getAbsAdd(Integer.MIN_VALUE, 1);
    
}