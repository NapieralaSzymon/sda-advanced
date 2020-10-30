package pl.sda.advanced.exceptions;

public class Calculator {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ValidationException("Cholero nie dziel przez zero!");
        }
        return a / b;
    }

}
