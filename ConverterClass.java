public class ConverterClass {

    private static final String[] romanNumbers = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
    private static final int[] arabicNumbers = {1, 4, 5, 9, 10, 40, 50, 90, 100};

    public static String toRoman( int num ) {

        String result = "";
        if ( num < 0 ) {
            result = "-";
            num = Math.abs(num);
        } else if ( num == 0 ) {
            return "N";
        }

        int n = arabicNumbers.length - 1;

        while ( num > 0 ) {

            if ( num >= arabicNumbers[n]) {
                result += romanNumbers[n];
                num -= arabicNumbers[n];
            } else {
                n--; // n = n - 1
            }
        }

        return result;
    }
}
