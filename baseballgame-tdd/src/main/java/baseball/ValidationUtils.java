package baseball;

public class ValidationUtils {
    public static boolean validNo(int ballNo) {
        return ballNo >= 0 && ballNo <= 9;
    }
}
