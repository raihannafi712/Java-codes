package lab8.task5;

public class ComplexNumber extends RealNumber {

    private double imaginaryValue;

    public ComplexNumber() {

        super(1.0);
        this.imaginaryValue = 1.0;
    }

    public ComplexNumber(double realValue, double imaginaryValue) {

        super(realValue);
        this.imaginaryValue = imaginaryValue;
    }

    public String toString() {
        
        return super.toString() + "\nImaginaryPart: " + imaginaryValue;
    }
}
