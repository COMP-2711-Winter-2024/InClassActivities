package ISP;

public class ElementaryMathStudent {
    private ElementaryCalculator calculator;

    public ElementaryMathStudent() {
        this.calculator = new ElementaryCalculator();
    }

    public double Calculate(String operation, int operand1, int operand2) {
        switch (operation.toLowerCase()){
            case "add":
                return this.calculator.add(operand1, operand2);
            case "subtract":
                return this.calculator.subtract(operand1, operand2);
            case "multiply":
                return this.calculator.multiply(operand1, operand2);
            case "divide":
                return this.calculator.divide(operand1, operand2);
            default:
                throw new IllegalArgumentException();
        }
    }

}
