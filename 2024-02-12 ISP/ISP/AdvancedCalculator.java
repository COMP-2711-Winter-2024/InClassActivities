package ISP;

public class AdvancedCalculator implements Calculatable {

    @Override
     public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return (double)num1 / (double)num2;
    }

    public double power(double num, double power) {
        return Math.pow(num, power);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

}
