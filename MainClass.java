import java.util.Scanner;

public class MainClass {

    public static void main (String[] args){

        start();
    }

    public static void start() {
        String a = "";
        String op = "";
        String b = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");

        try {
            String expression = scanner.nextLine();
            a = expression.split(" ")[0];
            op = expression.split(" ")[1];
            b = expression.split(" ")[2];
        } catch (Exception ex) {
            System.out.println("Check input! ");  // StringException
            System.exit(0);
        }

        String type = ControllerClass.getType(a);
        boolean controll = ControllerClass.controllExpression( a, b, op, type );

        if ( controll ) {
            int numA = ControllerClass.getNum(a, type);
            int numB = ControllerClass.getNum(b, type);

            int result = OperationClass.solution( numA, numB, op);

            System.out.print("Output: ");

            if ( type.equals(ControllerClass.typeNameRoman)) {
                System.out.println( ConverterClass.toRoman(result));
            } else {
                System.out.println(result);
            }

            start();
        } else {
            System.out.println("Check input, " +
                    "Roman or Arabic " +
                    "Obligated from 1 to 10 number length +-*/ using space only! ,  " + // StringException
                    "1 + 1, or V + I");
        }
    }
}
