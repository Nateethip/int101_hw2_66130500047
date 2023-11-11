
package work01;

public class Utilitor {
    
    public static String testString(String value) {
        if(value == null) throw new NullPointerException("value is null");
        if(value.isBlank()) throw new IllegalArgumentException("Value is Blank");
        return value;
    }
    
    public static double testPositive(double value) {
        if(value <= 0) throw new IllegalArgumentException("value is not positive");
        return value;
    }
    
    public static long computeIsbn10(long isbn10) {
        int sum = 0;
        int multiplier = 10;
        while (isbn10 > 0) {
            int digit = (int) (isbn10 % 10);
            sum += multiplier * digit;
            isbn10 /= 10;
            multiplier--;
        }
        int remainder = sum % 11;
        int checkDigit = (11 - remainder) % 11;
        return checkDigit;
    }
}
