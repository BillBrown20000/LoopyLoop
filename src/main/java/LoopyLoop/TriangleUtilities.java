package LoopyLoop;

public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String string = "";
        for (int x = 0; x < numberOfStars; x++ ) {
            string = string + "*";
        }
        return string;

    }
    public static String getTriangle(int numberOfRows) {
        String string = "";
        for (int x = 1; x <= numberOfRows; x++ ){
            string = string + getRow(x);
            string = string + "\n";
        }
        return string;

    }
    public static String getSmallTriangle() {
        return getTriangle(4);

    }
    public static String getLargeTriangle() {

        return getTriangle(9);

    }
}
