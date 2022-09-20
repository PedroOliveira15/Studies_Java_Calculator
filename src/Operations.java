public class Operations {
    private double result;

    public double sum(double a, double b){
        return this.result = a + b;
    }

    public double sub(double a, double b){
        return this.result = a - b;
    }

    public double multiply(double a, double b){
        return this.result = a * b;
    }

    public double division(double a, double b) {
        try {
            return this.result = a / b;
        } catch (ArithmeticException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return 0;
    }
}

