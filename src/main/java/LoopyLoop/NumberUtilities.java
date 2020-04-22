package LoopyLoop;

public class NumberUtilities {

    public static String getRange(int stop) {
        String string = "";
        for (int x = 0; x < stop; x++ ) {
        string = string + x;
        }
        return string;
    }
    public static String getRange(int start, int stop) {
        String string = "";
        for (int x = start; x <stop; x++){
            string = string + x;
        }
        return string;
    }
    public static String getRange(int start, int stop, int step) {
        String string = "";
        for (int x = start; x <stop;  x+=step){
            string = string + x;
        }

        return string;

    }
    public static String getEvenNumbers(int start, int stop) {
        String string = "";
        for (int x = start; x < stop; x++){
            if (x % 2 == 0)
            string = string + x;
        }
        return string;

    }
    public static String getOddNumbers(int start, int stop) {
        String string = "";
        for (int x = start; x < stop; x++){
            if (x%2 == 1)
            string = string + x;
        }
        return string;

    }
    public static String getExponentiations(int start, int stop, int exponent) {
        String string = "";
        for (int x = start; x <= stop; x++){
            string = string + (int)(Math.pow(x, exponent));
        }
        return string;
    }
}
