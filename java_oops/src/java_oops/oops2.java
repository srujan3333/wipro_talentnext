package java_oops;
public class oops2 {
    public static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        int intResult = oops2.powerInt(2, 5);
        double doubleResult = oops2.powerDouble(2.5, 3);
        System.out.println("2 to the power 5 is: " + intResult);
        System.out.println("2.5 to the power 3 is: " + doubleResult);
    }
}
