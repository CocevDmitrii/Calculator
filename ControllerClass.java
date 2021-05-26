import java.util.Arrays;

public class ControllerClass {

    private static final String[] ROMAN_NUM = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private static final String[] ARABIC_NUM = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final String[] OPERATOR = {"+", "-", "*", "/"};
    static final String typeNameRoman = "roman";
    static final String typeNameArabic = "arabic";

    public static boolean controllExpression(String a, String b, String operator, String type) {

        boolean numA;
        boolean numB;

        if ( type.equals(typeNameRoman)) {

            numA = Arrays.asList(ROMAN_NUM).contains(a);
            numB = Arrays.asList(ROMAN_NUM).contains(b);
        } else {

            numA = Arrays.asList(ARABIC_NUM).contains(a);
            numB = Arrays.asList(ARABIC_NUM).contains(b);
        }

        boolean op = Arrays.asList(OPERATOR).contains(operator);

        return numA == numB == op;
    }

    public static String getType(String a) {

        if ( Arrays.asList(ROMAN_NUM).contains(a) ) {
            return typeNameRoman;
        } else {
            return typeNameArabic;
        }
    }

    public static int getNum(String num, String format) {

        if ( format.equals(typeNameRoman) ) {
            return Arrays.asList(ROMAN_NUM).indexOf(num);
        } else {
            return Arrays.asList(ARABIC_NUM).indexOf(num);
        }
    }
}
